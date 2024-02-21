package com.encore.compare.sort;

public class QuickSortMain {

    public static void main(String[] args) {

        int[] ary = new int[10];
        putRandomNumbers(ary);

        System.out.println(">>>> 정렬 전 출력 <<<<");
        aryPrint(ary);

        quickSort(ary, 0, (ary.length - 1));
        System.out.println("\n>>>> 정렬 후 출력 <<<<");
        aryPrint(ary);

    }

    private static void putRandomNumbers(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            ary[i] = (int) (Math.random() * 100) + 1;
            for (int j = 0; j < i; j++) {
                // 중복 방지
                if (ary[j] == ary[i]) {
                    i--;
                    break;
                }
            }
        }
    }

    public static void aryPrint(int[] ary) {
        for (int i : ary) {
            System.out.print(i + "\t");
        }
    }

    public static void quickSort(int[] ary, int start, int end) {
        if (start >= end)
            return;

        int low = start;
        int high = end;
        int pivot = ary[(low + high) / 2];

        while (low <= high) {
            while (ary[low] < pivot)
                low++;
            while (ary[high] > pivot)
                high--;
            if (low <= high) {
                int tmp = ary[low];
                ary[low] = ary[high];
                ary[high] = tmp;
                low++;
                high--;
            }
        }

        int mid = low;
        quickSort(ary, start, mid - 1);
        quickSort(ary, mid, end);
    }

}
