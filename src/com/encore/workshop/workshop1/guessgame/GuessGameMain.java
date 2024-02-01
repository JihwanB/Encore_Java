package com.encore.workshop.workshop1.guessgame;

import java.util.Random;
import java.util.Scanner;

public class GuessGameMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int hiddenNumber = rand.nextInt(100) + 1;

        System.out.println("***********************************");
        System.out.println("1에서 100 사이의 숫자를 맞춰보세요");
        System.out.println("10번의 기회가 있습니다.");
        System.out.println("***********************************\n");

        int playCount = 1;
        while (playCount <= 10) {

            System.out.print(playCount + "번째 기회 입니다. 숫자를 입력하세요 : ");
            int inputNumber = GuessGame.getUserInput();

            if (inputNumber < 1 || inputNumber > 100) {
                System.out.println("1 ~ 100 사이의 값을 입력하세요.");
            }

            if (inputNumber > hiddenNumber) {
                System.out.println(inputNumber + " 보다 작습니다.");
            } else if (inputNumber < hiddenNumber) {
                System.out.println(inputNumber + " 보다 큽니다.");
            } else {
                System.out.println("축하합니다. " + playCount + "번 만에 맞추셨네요.");
                return;
            }

            playCount++;
        }

        System.out.println("\n10번의 기회가 끝났습니다. 다시 한 번 시도해 보세요.");
    }
}
