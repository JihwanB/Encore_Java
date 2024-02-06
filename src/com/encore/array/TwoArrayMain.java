package com.encore.array;

import java.util.Arrays;

public class TwoArrayMain {
    // 2차원 배열은 배열의 배열
    // 선언방법 : Type[][] arrayName
    public static void main(String[] args) {
        int[][] numArray = {{1, 2, 3}, {4, 5, 6}, {7, 8}};
        System.out.println("length : " + numArray.length);
        System.out.println("numArray[0] : " + numArray[0].length);
        System.out.println("numArray[1] : " + numArray[1].length);
        System.out.println("numArray[2] : " + numArray[2].length);
        System.out.println();

        // row
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                System.out.print("i = " + i + ", j = " + j + " \"" + numArray[i][j] + "\"\t");
            }
            System.out.println();
        }
        System.out.println();

        // 구구단의 결과를 2차원 배열에 담는다면?
        // 출력예시)
        // 2단 2 4 .... 10
        // 3단 3 6 .... 27

        int[][] multiplication = new int[8][9];
        for (int i = 0; i < multiplication.length; i++) {
            for (int j = 0; j < multiplication[i].length; j++) {
                multiplication[i][j] = (i + 2) * (j + 1);
                System.out.print(multiplication[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // 또 다른 방법
        for (int i = 0; i < multiplication.length; i++) {
            System.out.println(Arrays.toString(multiplication[i]));
        }
    }
}
