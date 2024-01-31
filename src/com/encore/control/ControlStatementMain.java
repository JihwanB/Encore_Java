package com.encore.control;

import java.util.Scanner;

/*
 * 제어구문 (if, switch)
 * if(논리값 | 논리식)
 * - 논리값을 가지고 조건판단
 *
 * // 비교할 변수에 들어갈 타입 (byte, short, int, char, String, enum)
 * // 실수값, 논리값, 대소 비교시에 사용 불가
 * switch(비교할 변수) {
 *     case 비교할 값:
 *         statement;
 *     case 비교할 값:
 *         statement;
 *     :
 *     :
 *     default : -- 조건에 만족하는 케이스가 없을 때 수행하는 영역
 *         statement;
 * }
 */
public class ControlStatementMain {
    public static void main(String[] args) {
        evenCheck();

        ControlStatementDemo demo = new ControlStatementDemo();
        System.out.println(demo.woodMan());

        // 금도끼 은도끼
        demo.example01();

        // calc() 메서드 호출 시 사칙연산자 +, -, *, /
        double value = demo.calc(100, '+', 100);
        System.out.println("Result >>>> " + value);
    }

    public static void evenCheck() {
        // Scanner 로부터 숫자 하나를 입력받아서 양수이면서 짝수인지 아닌지를 판단하고 싶다면?
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("논리값이 참(true)일 때 수행하게 되는 영역");
            if (number % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
        } else {
            System.out.println("논리값이 거짓(false)일 때 수행하게 되는 영역");
            System.out.println("양수를 넣지 않아서 프로그램을 종료합니다");
            System.exit(0);
        }
        System.out.println();
    }
}
