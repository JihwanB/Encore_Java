package com.encore.algorithm.practice.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 거스름돈
 */
public class Greedy1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt500 = N / 500;
        int cnt100 = (N % 500) / 100;
        int cnt50 = (N % 100) / 50;
        int cnt10 = (N % 50) / 10;

        System.out.println(cnt500 + cnt100 + cnt50 + cnt10);

    }

}
