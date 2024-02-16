package com.encore.jcf.collection.list.vector;

/*
 싱글 스레드 : 순차실행 main start - 파일 다운로드(A) - 파일 다운로드(B) - 파일 다운로드(C) - main end
 멀티 스레드 : 병렬실행 main start = 파일 다운로드(A)(thread) - 파일 다운로드(B)(thread) - 파일 다운로드(C)(thread) - main end
 ArrayList - Vector
 */
public class VectorDemoMain {

    public static void main(String[] args) {
        /* ex01
        List<Integer> lst = new ArrayList<>();
        List<Integer> vec = new Vector<>();

        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                lst.add(1); // non synchronized
                vec.add(1); // synchronized
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                lst.add(1); // non synchronized
                vec.add(1); // synchronized
            }
        }).start();

        // 출력을 위한 스레드
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("ArrayList size = " + lst.size());
                System.out.println("Vector size = " + vec.size());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
         */

        /* ex02
        List<Integer> vec = new Vector<>();
        // 두 개의 스레드가 동일한 Vector 접근하는 코드
        // 인스턴스 자체는 동기화가 되어있지 않음
        new Thread(() -> {
            vec.add(1);
            vec.add(2);
            vec.add(3);
            System.out.println(vec.get(0));
            System.out.println(vec.get(1));
            System.out.println(vec.get(2));
        }).start();

        new Thread(() -> {
            // 삭제 될때마다 사이즈가 자동으로 줄어듬
            vec.remove(0);
            vec.remove(0);
            vec.remove(0);
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Vector size = " + vec.size());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
         */

    }

}
