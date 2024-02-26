package com.encore.algorithm.practice.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 위에서 아래로
 */
public class Sort1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Integer[] ary = new Integer[n];

        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ary, new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < n; i++) {
            sb.append(ary[i]).append(" ");
        }

        System.out.println(sb);
    }

}
