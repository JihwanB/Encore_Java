package com.encore.workshop.workshop1.guessgame;

import java.util.Scanner;

public class GuessGame {
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }
}
