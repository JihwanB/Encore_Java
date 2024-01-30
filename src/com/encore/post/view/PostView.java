package com.encore.post.view;

import com.encore.post.domain.PostRequestDTO;
import com.encore.post.service.PostService;

import java.util.Scanner;

public class PostView {

    private PostService service;
    private PostRequestDTO params;

    public PostView() {

    }

    public PostView(PostService service, PostRequestDTO params) {
        this.service = service;
        this.params = params;
    }

    public void menu() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println(">>>> Hanwha software camp Beyond 5th <<<<");
            System.out.println("1. login");
            System.out.println("2. join");
            System.out.println("3. post write");
            System.out.println("4. post delete");
            System.out.println("99. exit");
            System.out.print("input number : ");
            int number = scan.nextInt();

            // 1, 2 번은 우선 생략
            if (number == 99) {
                System.out.println("종료되었습니다.");
                System.exit(0);
            } else if (number == 3) {
                requestSave();
            } else if (number == 4) {
                requestDelete();
            }
        }
    }

    public void requestSave() {
        System.out.println("debug >>>> client post write view");

        Scanner scan = new Scanner(System.in);

        System.out.print("아이디 : ");
        String id = scan.nextLine();

        System.out.print("제목 : ");
        String title = scan.nextLine();

        System.out.print("내용 : ");
        String content = scan.nextLine();

        System.out.print("조회수 : ");
        int views = scan.nextInt();

        System.out.print("공개여부 : ");
        boolean isPrivate = scan.nextBoolean();

        // view has a service
        // service.savePost(id, title, content, views, isPrivate);
        // PostRequestDTO request = new PostRequestDTO(id, title, content, views, isPrivate);
        // PostService service = new PostService();
        params.setId(id);
        params.setTitle(title);
        params.setContent(content);
        params.setViews(views);
        params.setPrivate(isPrivate);

        String msg = service.savePost(params);
        System.out.println("Result >>>> " + msg);
        System.out.println();
    }

    // 터미널로부터 사용자의 아이디만 입력받아서 해당 아이디를 DTO에 담고,
    // PostService 클래스에 정의된 postDelete(PostRequestDTO params) 메서드를 호출하여
    // "작성하신 글이 삭제되었습니다." 메시지를 반환 받아서 출력
    public void requestDelete() {

        System.out.println("debug >>>> client post delete view");

        Scanner scan = new Scanner(System.in);
        System.out.print("아이디 : ");
        String id = scan.nextLine();

        // PostRequestDTO request = new PostRequestDTO(id);
        // PostService service = new PostService();
        params.setId(id);

        String msg = service.deletePost(params);
        System.out.println("Result >>>> " + msg);
        System.out.println();
    }
}
