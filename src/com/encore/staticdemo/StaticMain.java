package com.encore.staticdemo;

public class StaticMain {
    public static void main(String[] args) {

        // lombok annotation 활용한 호출
        StaticDemo demo01 = new StaticDemo("jslim");
        System.out.println(demo01.getName());

        StaticDemo demo02 = new StaticDemo("encore");
        System.out.println(demo02.getName());

        demo01.stringMsg = "demo01 msg";
        demo02.stringMsg = "demo02 msg";

        // static으로 공유되어지는 필드이기 때문에, "demo01 msg"가 아니라 "demo02 msg"로 덮어 씌워짐
        System.out.println(demo01.stringMsg);

        // staticMethod() 인스턴스 소유가 아닌 클래스 소유이므로 클래스 이름으로 접근 가능
        // StaticDemo.nonStatic(); // error
        StaticDemo.staticMethod();
    }
}
