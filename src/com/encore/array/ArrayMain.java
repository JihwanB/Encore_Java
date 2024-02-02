package com.encore.array;

import java.util.Random;

public class ArrayMain {
    public static void main(String[] args) {

        // 참조아팁의 배열 선언으로 사용하기 위해서는 객체 생성이 필요
        // 선언과 동시에 객체 생성 완료
        int[] arr = new int[10];
        System.out.println("배열의 길이 : " + arr.length);

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        // Enhanced for loop
        System.out.println(">>> enhanced loop <<<");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
