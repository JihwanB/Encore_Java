package com.encore.thread;

/*
    자바에서 스레드의 대상이 되는 객체를 정의하고 싶다면
    두 방법이 있음
    1. extends Thread
    2. implements Runnable
    자바에서는 다중상속이 안되기 때문에, Thread 를 상속받기 보다는 Runnable 을 구현하는 방법을 지향
 */
public class ShareObj implements Runnable {

    public ShareObj() {

    }

    // 스레드의 구현부
    // 코드상에서 개발자가 직접적으로 호출할 수 없다.
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}
