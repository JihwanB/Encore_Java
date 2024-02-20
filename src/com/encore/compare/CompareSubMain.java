package com.encore.compare;

import java.util.*;

/*
 정렬 : 모든 프로그램은 오름차순을 기본으로 정렬
 JAVA 프로그램에서 기준을 정의하지 않으면 오름차순
 기본타입과, 배열이 기본 타입을 요소로 가지고 있다면
 Arrays.sort(), Collections.sort()

 [정렬의 일반화된 규칙]
 - 비교 결과 리턴될 때, 음수라면 두 원소의 위치를 교환하지 않음.
 */
public class CompareSubMain {

    public static void main(String[] args) {

        EncoreInteger[] ary = new EncoreInteger[10];
        // 1 ~ 100의 무작위의 정수로 배열 초기화
        for (int i = 0; i < ary.length; i++) {
            ary[i] = new EncoreInteger((int) ((Math.random() * 100) + 1));
        }

        // 정렬 전
        System.out.println("정렬 전 >>>>>");
        for (EncoreInteger i : ary) {
            System.out.print(i.getData() + "\t");
        }

        System.out.println();
        // 정렬 후
        Arrays.sort(ary);
        // 내림차순
        //Arrays.sort(ary, Collections.reverseOrder());

        System.out.println("정렬 후 >>>>>");
        for (EncoreInteger i : ary) {
            System.out.print(i.getData() + "\t");
        }

    }

}
