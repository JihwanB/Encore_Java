package com.encore.loop;

import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class LoopDemo02 {

    // 1 ~ 100 난수의 합을 구해보고 싶다.
    public void sumRandom() {
        double rand = (int) (Math.random() * 100) + 1;
        System.out.println(rand);

        int sum = 0;
        for (int i = 1; i <= rand; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    // 난수(1~100) 2개를 발생시켜서 최소값부터 최대값까지의 합을 구하고 싶다면?
    public void sumRandomTwo() {
        int min = (int) ((Math.random() * 100) + 1);
        int max = (int) ((Math.random() * 100) + 1);

        if (min > max) {
            int tmp = max;
            max = min;
            min = tmp;
        }

        System.out.println("min : " + min);
        System.out.println("max : " + max);

        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }

        System.out.printf("sum from %d to %d : %d", min, max, sum);
    }

    public void charPrint(char start, char end) {
        for (char c = start; c <= end; c++) {
            System.out.printf("%c\t", c);
        }
    }

    // 1 ~ 100 사이의 홀수의 합을 출력한다면?
    public void sumOdd() {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1)
                sum += i;
        }
        System.out.println("1 ~ 100 홀수의 합 : " + sum);
    }

    // 1 ~ 100 난수를 발생시켜서 짝수의 개수가 몇개인지 출력한다면?
    public void countEven() {
        int count = 0;
        int rand = (int) (Math.random() * 100) + 1;

        for (int i = 1; i <= rand; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.printf("1부터 %d까지 짝수의 개수 : %d", rand, count);
    }

    // 매개변수로 문자열을 입력받아서 문자를 하나씩 추출하여 출력
    public void splitString(String str) {
        System.out.println("args -> " + str);
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    // 스캐너를 이용해서 값을 입력받고 1부터 차례로 누적하여 합을 구하다가, 입력한 값을 넘으면 중단하고
    // 마지막으로 더해진 값과 그 떄 까지의 합을 출력
    // 입력 예) 100
    // 출력 예) 20 104
    public void sumBreak() {
        Scanner sc = new Scanner(System.in);

        System.out.print("데이터를 입력하세요 : ");
        int n = sc.nextInt();

        int idx = 1;
        int sum = 0;
        while (true) {
            sum += idx;
            if (sum > n)
                break;
            idx++;
        }
        System.out.printf("%d\t%d", idx, sum);
    }

    public void nestedFor() {
        for (int row = 1; row <= 10; row++) {
            System.out.println("row idx = " + row);
            for (int col = 1; col <= 10; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void gugudan() {
        for (int dan = 2; dan <= 9; dan++) {
            System.out.printf(">>>> %d단 <<<<\n", dan);
            for (int number = 1; number <= 9; number++) {
                System.out.print(dan + " * " + number + " = " + (dan * number) + "\t");
            }
            System.out.println();
        }
    }

    public void gugudanTable() {
        for (int dan = 2; dan <= 9; dan++) {
            System.out.printf(">>>> %d단 <<<<\n", dan);
            gugudanTimes(dan);
        }
    }

    private void gugudanTimes(int dan) {
        for (int n = 1; n <= 9; n++) {
            System.out.print(dan + " * " + n + " = " + (dan * n) + "\t");
        }
        System.out.println("\n");
    }

    // i, j 변수만 출력(5 * 5)
    public void printIJ() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("row = " + i + ", column = " + j);
            }
        }
    }

    /*
        출력예시:
        23456
        34567
        45678
        56789
        678910
     */
    public void forLine() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + j);
            }
            System.out.println();
        }
    }

    public void gugudan02() {
        for (int number = 1; number <= 9; number++) {
            for (int dan = 2; dan <= 9; dan++) {
                if (dan > 5) {
                    break;
                }
                System.out.print(dan + " * " + number + " = " + (dan * number) + "\t");
            }
            System.out.println();
        }
    }

    public void forLabel() {
        outer:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    break outer;
                }
                System.out.println("i, j = " + i + "\t" + j);
            }
        }
    }

    public void whileOneToTen() {
        int idx = 1;
        while (idx <= 10) {
            System.out.println(idx + "\t");
            idx++;
        }
    }

    // 스캐너로부터 문자열을 입력받아서 for, while 구문으로
    // 입력된 문자열의 각 문자의 인덱스와 문자를 쌍으로 출력
    // 입력예시 : java
    // 출력예시:
    // 0 : j
    // 1 : a
    // 2 : v
    // 3 : a
    public void printStrIdx() {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + " : " + str.charAt(i));
        }

        System.out.println();

        int idx = 0;
        while (idx < str.length()) {
            System.out.println(idx + " : " + str.charAt(idx));
            idx++;
        }
    }

    public void doWhileTest() {
        System.out.println("do ~ while");
        do {
            System.out.println("false 이지만 한번은 무조건 수행!!");
        } while (false);
    }
}