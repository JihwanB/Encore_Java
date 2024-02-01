package com.encore.workshop.workshop3.lotto.exercise;

import java.util.Arrays;
import java.util.Random;

public class ExerciseLotto {
    public int[] generateLottoNumbers() {
        Random rand = new Random();

        int[] lottoNumbers = new int[6];
        boolean flag;

        for (int i = 0; i < lottoNumbers.length; i++) {

            do {

                flag = false;

                lottoNumbers[i] = rand.nextInt(45) + 1;

                for (int j = 0; j < i; j++) {
                    if (lottoNumbers[i] == lottoNumbers[j]) {
                        flag = true;
                    }
                }

            } while (flag);

        }
        return lottoNumbers;
    }

    public void displayLottoNumbers(int[] lottoNumbers) {
        System.out.println("<< Lotto >>");

        for (int i : lottoNumbers) {
            System.out.print(i + " ");
        }
    }

    public void sortLottoNumbers(int[] lottoNumbers) {
        Arrays.sort(lottoNumbers);
    }

    public static void main(String[] args) {
        ExerciseLotto lotto = new ExerciseLotto();
        int[] lottoNumbers = lotto.generateLottoNumbers();

        lotto.sortLottoNumbers(lottoNumbers);
        lotto.displayLottoNumbers(lottoNumbers);
    }
}
