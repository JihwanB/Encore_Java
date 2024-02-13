package com.encore.thread;

public class ThreadDemoMain {

    public static void main(String[] args) {
        System.out.println("main thread start !!");

        ShareObj obj = new ShareObj();
        // obj.run();  // 스레드의 생명주기를 제어할 수 없게 됨
        Thread thread01 = new Thread(obj);
        thread01.start();

        ShareObj obj02 = new ShareObj();
        Thread thread02 = new Thread(obj02);
        thread02.start();

        System.out.println("main thread end !!");
    }
}
