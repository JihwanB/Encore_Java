package com.encore.loop;

public class LoopMain {
    public static void main(String[] args) {
        // 객체생성
        LoopDemo demo = new LoopDemo();

        // 메서드 호출
        // demo.LoopMethod01();
        // demo.sumOneToTen();
        // demo.sumStartToEnd(1, 1000);

         // String msg = demo.leapYear(2024);
         // System.out.println(msg);

        // 추출된 윤년을 한 줄에 5개의 년도씩 출력
        demo.leapYearStartToEnd(1900, 2024);
    }
}
