package com.encore.algorithm.practice.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * 두 배열의 원소 교체
 */
public class Sort3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B, (o1, o2) -> o2 - o1);

        for (int i = 0; i < K; i++) {
            if(A[i]>B[i])
                break;
            int tmp = A[i];
            A[i] = B[i];
            B[i] = tmp;
        }

        /*
        if (K > 0) {
            for (int i = 0; i < N; i++) {
                for (int j = i; j < N; j++) {
                    if (A[i] < B[j] && K > 0) {
                        int tmp = A[i];
                        A[i] = B[j];
                        B[j] = tmp;
                        K--;
                        break;
                    }
                }
            }
        }
         */

        int sum = 0;
        for (int i :A) {
            sum += i;
        }

        // System.out.println(Arrays.toString(A));
        // System.out.println(Arrays.toString(B));
        System.out.println(sum);

    }

}
