package com.encore.algorithm.practice.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 큰 수의 법칙
 */
public class Greedy2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] array = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int biggest = array[array.length - 1];
        int secondBiggest = array[array.length - 2];

        int count = ((M / (K + 1) * K) + (M % (K + 1)));

        int sum = 0;
        sum += count * biggest;
        sum += (M - count) * secondBiggest;

        System.out.println(sum);

    }

}
