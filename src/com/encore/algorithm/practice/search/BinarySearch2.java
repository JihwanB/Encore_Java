package com.encore.algorithm.practice.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 떡볶이 떡 만들기
 */
public class BinarySearch2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] riceCakes = new int[N];

        int max = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < riceCakes.length; i++) {
            riceCakes[i] = Integer.parseInt(st.nextToken());
            if (riceCakes[i] > max)
                max = riceCakes[i];
        }


        int start = 0;
        int end = max;

        int result = 0;
        while (start <= end) {
            int total = 0;
            int mid = (start + end) / 2;
            for (int x : riceCakes) {
                if (x > mid)
                    total += x - mid;
            }
            if (total < M)
                end = mid - 1;
            else {
                result = mid;
                start = mid + 1;
            }
        }

        System.out.println(result);

    }

}
