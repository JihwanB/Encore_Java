package com.encore.operator;

import java.util.Scanner;

public class OperatorDemo {
    public OperatorDemo() {

    }

    // example01 반환값 X, 매개변수 X
    public void example01() {
        System.out.println(">>>> 산술연산");
        int x = 100, y = 100, result = 0;   // 지역변수는 선언 후, 사용전에 초기화를 해줘야 함
        System.out.println(" + " + (x + y));
        System.out.println(" - " + (x - y));
        System.out.println(" * " + (x * y));
        System.out.println(" / " + (x / y));
        System.out.println(" % " + (x % y));
        System.out.println();

    }

    public String example02(String color01, String color02) {
        System.out.println(">>>> 연결연산");
        return "신호등의 색깔은 " + color01 + " 과 " + color02 + " 입니다." + "\n";
    }

    public void example03() {
        System.out.println(">>>> 논리연산");
        boolean isFlag = false;
        System.out.println("논리 부정, " + !isFlag);
        System.out.println();

        // Scanner 로 부터 입력받은 숫자가 짝수인지 아닌지 판단해보고 싶다면?
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int number = sc.nextInt();

        System.out.println("Result >>>> 짝수 " + (number % 2 == 0));
        System.out.println("Result >>>> 홀수 " + (number % 2 != 0));

        // Scanner 로 부터 입력받은 숫자가 3의 배수인지 아닌지를 판단하고 싶다면?
        System.out.println("Result >>>> 3의 배수 " + (number % 3 == 0));

        //Scanner 로 부터 입력받은 숫자가 양수인지 아닌지를 판단하고 싶다면?
        System.out.println("Result >>>> 양수 " + (number > 0));

        System.out.println();
    }

    public void example04() {
        System.out.println(">>>> 증감연산");
        int age = 50;
        System.out.println("현재 나이는 = " + age);
        System.out.println("후위 연산시 나이는 = " + age++);
        System.out.println("전위 연산시 나이는 = " + ++age);

        System.out.println();
        int number = 20;
        int result1 = number++ * 3, result2 = ++number * 3;
        System.out.println("Result >>>> " + result1);
        System.out.println("Result >>>> " + result2);

        System.out.println();
    }

    public void example05() {
        System.out.println(">>>> 일반논리연산");
        /*
         * &(이면서, 이고)) |(이거나), (&&, ||) - short shortcut
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int number = sc.nextInt();

        // Scanner 로부터 입력받은 숫자가 1~100 사이값인지 판단하고 싶다면?
        System.out.println("1 ~ 100 " + (number >= 1 && number <= 100));

        System.out.println();
    }

    public void example06() {
        System.out.println(">>>> 일반논리연산");

        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        char str = sc.next().charAt(0);
        // Scanner 로부터 입력받은 문자가 A ~ Z 대문자인지 판단하고 싶다면?
        System.out.println("input char, " + (str));
        System.out.println("A ~ Z " + (str >= 'A' && str <= 'Z'));
    }

    public void example07() {
        System.out.println(">>>> 삼항연산");
        // (조건식) ? 참 : 거짓
        // 혹은
        // (조건식)? 참 : ((조건식) ? 참 : 거짓)
        // 이런 것도 가능

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int number = sc.nextInt();

        // Scanner 로부터 입력받은 숫자가 양수인지 음수인지, 아니면 0인지 판단하고 싶다면?
        // String result = (number > 0) ? "양수" : "거짓";
        String result = (number > 0) ? "양수" : (number == 0) ? "0" : "음수";
        System.out.println("Result >>>> " + (result));
    }
}
