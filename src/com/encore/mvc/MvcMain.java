package com.encore.mvc;

import com.encore.mvc.controller.InsertController;
import com.encore.mvc.controller.SelectController;
import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.domain.PostResponseDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MvcMain {

    public static void main(String[] args) {

        // 사용자의 입력화면을 통해서 게시글 작성을 요청하는 영역
        InsertController insert = new InsertController();

        // 사용자가 입력한 값을 DTO 에 담아서 Controller 에게 전달
        /*
        PostRequestDTO params = new PostRequestDTO();
        params.setTitle("불금");
        params.setContent("간호해야함");
        params.setWriter("섭섭해");

        int flag = insert.execute(params);
         */

        /* Map 으로 데이터 전달
        Map<String, String> map = new HashMap<>();
        map.put("title", "불필요한 금요일");
        map.put("content", "병원에 가자");
        map.put("writer", "임섭순");

        int flag = insert.execute(map);
        System.out.println(">>>> insert Result : " + flag);
         */

        System.out.println(">>> 전체 출력 <<<");
        SelectController select = new SelectController();
        List<PostResponseDTO> response = select.execute();
        for (PostResponseDTO dto : response) {
            System.out.println("idx : " + dto.getIdx() + ", " + "title : " + dto.getTitle() + ", " + "content : "
                    + dto.getContent() + ", " + "writer : " + dto.getWriter());
        }

    }

}
