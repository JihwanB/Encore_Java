package com.encore.thread;

/*
    멀티스레드 환경에서 공유객체를 동시에 사용할 때 발생하는 문제를 해결하기 위해서는
    동기화 작업이 필요
    synchronized 키워드를 이용하는 방법이 있음
 */
public class PrtThread implements Runnable {

    private Prt monitor;
    private char charValue;

    public PrtThread(char charValue, Prt monitor) {
        this.charValue = charValue;
        this.monitor = monitor;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (monitor) {
                monitor.printChar(charValue);
            }
        }
    }

}
