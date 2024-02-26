package com.encore.algorithm.practice.search;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 부품 찾기
 */
public class BinarySearch1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] dongBin = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            dongBin[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] guest = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            guest[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(dongBin);

        for (int i : guest) {
            if (search(dongBin, i)) {
                bw.write("yes ");
            } else
                bw.write("no ");
        }

        bw.flush();
        bw.close();

    }

    public static boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return false;
    }

}
