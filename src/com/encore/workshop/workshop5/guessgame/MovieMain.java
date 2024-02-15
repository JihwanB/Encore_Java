package com.encore.workshop.workshop5.guessgame;

import java.io.IOException;

public class MovieMain {

    public static void main(String[] args) throws IOException {

        MovieServiceImpl service = new MovieServiceImpl();
        String selectedSentence = service.selectSentence();
        // System.out.println(" selectedSentence >>> " + selectedSentence + "\n");
        String str = service.initGame(selectedSentence);
        StringBuffer solving = new StringBuffer(str);

        int chance = 5;
        while ((chance > 0) && !(selectedSentence.contentEquals(solving))) {
            System.out.println();
            System.out.println("[남은 기회] : " + chance);
            System.out.print("한 글자를 입력하세요 : ");
            String letter = service.getOneLetter();

            if (service.checkString(selectedSentence, solving, letter)) {
                System.out.println("\n" + solving);
            } else {
                System.out.println("해당 글자가 없습니다.");
                System.out.println("\n" + solving);
                chance--;
            }
        }

        if (selectedSentence.contentEquals(solving)) {
            System.out.println("\n축하합니다.");
            System.exit(0);
        } else {
            System.out.println("\n다음 기회에 다시 도전하세요...");
        }

    }

}