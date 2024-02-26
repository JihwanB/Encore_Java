package com.encore.algorithm.practice.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 숫자 카드 게임
 */
public class Greedy3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] cards = new int[M];

        int result = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < cards.length; j++) {
                cards[j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, cards[j]);
            }
            result=Math.max(result, min);
        }

        System.out.println(result);

    }

}
