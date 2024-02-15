package com.encore.workshop.workshop5.guessgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MovieServiceImpl {

    private List<String> lst;

    public MovieServiceImpl() {
        lst = new ArrayList<>(Arrays.asList("Matrix",
                "I know what you did last summer", "The Silence Of The Lambs",
                "Saving Private Ryan", "Black Hawk Down", "American Pie",
                "Enemy Of The State"));
    }

    public String selectSentence() {
        Random random = new Random();
        int index = random.nextInt(7);

        return lst.get(index);
    }

    // 사용자로부터 한 문자를 입력받아서 반환
    public String getOneLetter() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        return String.valueOf(br.readLine().charAt(0));
    }

    public String initGame(String selectedSentence) {
        System.out.println("================================================");
        System.out.println(" 영화 제목을 맞춰 보세요......");
        System.out.println(" 5번 까지 틀릴 수 있는 기회가 있습니다.");
        System.out.println("================================================\n");

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < selectedSentence.length(); i++) {
            if (selectedSentence.charAt(i) == ' ') {
                sb.append(' ');
            } else {
                sb.append('□');
            }
        }
        String initStr = sb.toString();
        System.out.println(initStr);

        return initStr;
    }

    /**
     * 영화 제목에서 입력받은 문자를 정답으로 변경하고 찾았는지 여부를 반환
     *
     * @param selectedSentence 영화 제목
     * @param solvingSentence  문제 풀이중인 영화제목
     * @param letter           사용자가 입력한 문자
     * @return 입력한 문제가 존재하는지 여부
     */
    public boolean checkString(String selectedSentence, StringBuffer solvingSentence, String letter) {

        for (int i = 0; i < selectedSentence.length(); i++) {
            if (letter.equalsIgnoreCase(String.valueOf(selectedSentence.charAt(i))) && solvingSentence.charAt(i) == '□') {
                solvingSentence.replace(i, i + 1, String.valueOf(selectedSentence.charAt(i)));
                return true;
            }
        }

        return false;

    }

}
