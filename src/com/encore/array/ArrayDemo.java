package com.encore.array;

import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class ArrayDemo {

    // Scanner 를 이용해서 5명 학생들의 국어점수만 입력받고, 입력받은 점수를 배열에 담아서 반환
    public int[] makeScores() {

        int[] scoreArr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scoreArr.length; i++) {
            System.out.print((i + 1) + "번째 학생의 점수를 입력하세요 : ");
            scoreArr[i] = sc.nextInt();
        }

        return scoreArr;

    }

    public void scorePrint(int[] arr) {

        int sum = 0, avg = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = sum / arr.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

    }

}
