package com.encore.vending;

import lombok.*;

import java.util.Scanner;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
public class VendingMachine {

    @NonNull
    private String type;

    private static final int COLA = 800, WATER = 500, VITA_WATER = 1500;
    private static int money, menuNumber, thousand, fiveHundred, hundred;

    public void init() {

        switch (getType()) {
            case "if":
                ifVending();
                break;
            case "switch":
                switchVending();
                break;
        }
    }

    private void menu() {

        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 입력하세요. : ");
        money = sc.nextInt();

        System.out.println("메뉴를 고르세요.");
        System.out.print("1.콜라(800원)  2.생수(500원)  3.비타민워터(1500원) >> ");
        menuNumber = sc.nextInt();
    }

    private void ifVending() {

        System.out.println(">>>> if 구현");
        menu();

        if (menuNumber == 1 && money >= COLA) {
            money -= COLA;
        } else if (menuNumber == 2 && money >= WATER) {
            money -= WATER;
        } else if (menuNumber == 3 && money >= VITA_WATER) {
            money -= VITA_WATER;
        } else {
            System.out.println("잔액이 부족합니다.");
        }

        thousand = money / 1000;
        fiveHundred = (money % 1000) / 500;
        hundred = (money % 500) / 100;

        System.out.println("잔돈 : " + money + "원");
        System.out.printf("천원 : %d개, 오백원 : %d개, 백원 : %d개", thousand, fiveHundred, hundred);
    }

    private void switchVending() {

        System.out.println(">>>> switch 구현");
        menu();

        int price = 0;

        switch ((menuNumber)) {
            case 1:
                price = COLA;
                break;
            case 2:
                price = WATER;
                break;
            case 3:
                price = VITA_WATER;
                break;
        }

        if (money < price) {
            System.out.println("잔액이 부족합니다.");
        } else {
            money -= price;
        }

        thousand = money / 1000;
        fiveHundred = (money % 1000) / 500;
        hundred = (money % 500) / 100;

        System.out.println("잔돈 : " + money + "원");
        System.out.printf("천원 : %d개, 오백원 : %d개, 백원 : %d개", thousand, fiveHundred, hundred);
    }

}
