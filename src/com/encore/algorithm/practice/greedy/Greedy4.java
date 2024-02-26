package com.encore.algorithm.practice.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 */
public class Greedy4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0;
        while (true) {
            int target = (N / K) * K;
            count += (N - target);
            N = target;
            if (N < K)
                break;
            N /= K;
            count += 1;
        }

        count += (N - 1);
        System.out.println(count);

    }

}
