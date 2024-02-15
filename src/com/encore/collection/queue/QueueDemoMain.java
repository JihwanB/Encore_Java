package com.encore.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 먼저 들어간 데이터가 먼저 나오는 선입선출 (=FIFO) (Enqueue, Dequeue)
 */
public class QueueDemoMain {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10); queue.offer(20); queue.offer(30); queue.offer(40);
        System.out.println("peek : " + queue.peek());
        System.out.println("poll : " + queue.poll());
        System.out.println("size : " + queue.size());
        System.out.println("remove : " + queue.remove());
        System.out.println("size : " + queue.size());
        System.out.println("clear : ");
        queue.clear();
        System.out.println("size : " + queue.size());

        System.out.println("main end");

    }

}
