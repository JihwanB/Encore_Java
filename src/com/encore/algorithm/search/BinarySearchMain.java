package com.encore.algorithm.search;

import java.util.Arrays;

public class BinarySearchMain {

    public static void main(String[] args) {

        Integer[] ary = new Integer[14];
        putRandomNumbers(ary);

        System.out.println("정렬 전 데이터 >>>>");
        aryPrint(ary);

        Arrays.sort(ary);
        System.out.println("\n정렬 후 데이터 >>>>");
        aryPrint(ary);

        //int idx = binarySearch(ary, 6);
        int idx = recursiveSearch(ary, 0, ary.length - 1, 6);
        if (idx >= 0) {
            System.out.printf("\n찾으려는 숫자가 %d번 인덱스에 있습니다. ", idx);
            System.out.printf("ary[%d] : %d", idx, ary[idx]);
        } else {
            System.out.println("\n찾으려는 숫자가 없습니다.");
        }

    }

    public static void putRandomNumbers(Integer[] ary) {
        for (int i = 0; i < ary.length; i++) {
            ary[i] = (int) (Math.random() * 100) + 1;
            for (int j = 0; j < i; j++) {
                // 중복 방지
                if (ary[j].equals(ary[i])) {
                    i--;
                    break;
                }
            }
        }
    }

    public static void aryPrint(Integer[] ary) {
        for (int i : ary) {
            System.out.print(i + "\t");
        }
    }

    public static int binarySearch(Integer[] ary, int target) {
        int low = 0;
        int high = ary.length - 1;
        int mid;

        while (low <= high) {
            mid = low + ((low + high) / 2);
            if (ary[mid] == target) {
                return mid;
            } else if (ary[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int recursiveSearch(Integer[] ary, int start, int end, int target) {
        if(start >= end)
            return -1;

        int mid = (start + end) / 2;

        if (ary[mid] == target)
            return mid;
        if (ary[mid] < target)
            return recursiveSearch(ary, mid + 1, end, target);
        else
            return recursiveSearch(ary, start, mid - 1, target);

    }

}
