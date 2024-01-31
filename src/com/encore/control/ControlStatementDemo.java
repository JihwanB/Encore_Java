package com.encore.control;

import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class ControlStatementDemo {
    /*
     * A 또는 B 라는 값을 기대할 수 있다.
     * 조건식에 대한 값이 true 이면 if 문 안의 내용을 실행하고, false 이면 else 문 안의 내용을 수정
     */

    /*
     * 메뉴구성(1. 금도끼 2. 은도끼 3.쇠도끼)
     * 조건1) 입력숫자는 1~3 사이
     * 조건2) 1번 선택시 "거짓말을 하는구나 아무 도끼도 줄 수 없다."
     * 조건3) 2번 선택시 "또 거짓말을 하는구나 아무 도끼도 줄 수 없다."
     * 조건4) 3번 선택시 "정직하구나 너에게 모든 도끼를 주겠다."
     * 조건5) 조건 판단이 끝나면 산신령은 연못으로 사라진다
     */
    public String woodMan() {

        String msg = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("너가 잃어버린 도끼는 무엇이냐");
        System.out.println("1. 금도끼 2. 은도끼 3. 쇠도끼");
        System.out.print("번호 : ");
        int number = sc.nextInt();

        if (number >= 1 && number <= 3) {
            if (number == 1) {
                msg = "거짓말을 하는구나 아무 도끼도 줄 수 없다.";
            } else if (number == 2) {
                msg = "또 거짓말을 하는구나 아무 도끼도 줄 수 없다.";
            } else {
                msg = "정직하구나 너에게 모든 도끼를 주겠다.";

            }
        } else {
            System.out.print("1 ~ 3 사이의 숫자를 입력하거라.");
        }

        msg = msg.concat("\n산신령은 연못으로 사라진다.\n");


        return msg;
    }

    /*
       메서드명 : public void example01(){}
       구현 내용 :
       국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
       각 점수를 키보드로 입력받고,
       합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
       세 과목의 점수와 평균을 가지고 합격 여부 처리함

       <합격의 조건>
       세 과목의 점수가 각각 40점 이상이면서,
       평균이 60점 이상이면 합격, 아니면 불합격 처리함

     */

    public void example01() {
        int korean, english, math, total;
        double avg;

        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수 : ");
        korean = sc.nextInt();

        System.out.print("영어 점수 : ");
        english = sc.nextInt();

        System.out.print("수학 점수 : ");
        math = sc.nextInt();

        total = korean + english + math;
        avg = total / 3.0;

        System.out.println("평균 점수 : " + avg);

        if (korean >= 40 && english >= 40 && math >= 40) {
            if (avg >= 60) {
                System.out.println("합격입니다.");
            } else {
                System.out.println("평균 점수 미달로 불합격입니다.");
            }
        } else {
            if (korean < 40) {
                System.out.println("국어 점수 미달로 불합격입니다.");
            }
            if (english < 40) {
                System.out.println("영어 점수 미달로 불합격입니다.");
            }
            if (math < 40) {
                System.out.println("수학 점수 미달로 불합격입니다.");
            }
        }
        System.out.println();
    }

    // case 기본 if, 삼항연산자, switch-case
    public double calc(int x, char op, int y) {
        double result = 0.0;

//        if (op == '+') {
//            result = x + y;
//        } else if (op == '-') {
//            result = x - y;
//        } else if (op == '*') {
//            result = x * y;
//        } else if (op == '/') {
//            result = (double) x / y;
//        }
//
//        result = (op == '+') ? x + y : (op == '-') ? x - y : (op == '*') ? x * y : (double) x / y;

        switch (op) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = (double) x / y;
                break;
            default:
                System.out.println("사칙연산만 가능합니다.");
        }

        return result;
    }
}
