package com.encore.workshop.workshop1.primenumber;


import java.util.Scanner;

public class ExercisePrimeNumber {
    // 소수 판단하는 로직 (for, if)
    // 0, 1 은 소수가 아니다. 2는 소수이다.
    // 어떤 숫자가 소수가 되려면 11을 2부터 10(11보다 1작은 숫자)까지 차례대로 나누어보고
    // 나머지가 0인 경우가 한번도 없으면 그 수는 소수이다.
    public static int getUserInput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int result = sc.nextInt();
        
        return result;
    }
    
    public static void isPrimeNumber(int number){
        if(number == 1 || number == 0) {
            System.out.println(number + "은(는) 소수가 아닙니다.");
        }else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(number + "은(는) 소수가 아닙니다.");
                    return;
                }
            }
            System.out.println(number + "은(는) 소수입니다.");
        }
    }
}
