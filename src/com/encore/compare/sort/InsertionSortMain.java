package com.encore.compare.sort;

public class InsertionSortMain {

    public static void main(String[] args) {

        // 10개의 방을 가지는 배열만들고 랜덤한(1~100) 값으로 초기화 후 정렬 전 출력
        int[] ary = new int[10];
        putRandomNumbers(ary);

        System.out.println(">>>> 정렬 전 출력 <<<<");
        aryPrint(ary);

        insertionSort(ary, ary.length);
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

    public static void insertionSort(int[] ary, int size) {
        for (int i = 1; i < size; i++) {

            int target = ary[i];

            int j = i - 1;

            while (j >= 0 && target < ary[j]) {
                ary[j + 1] = ary[j];
                j--;
            }

            ary[j + 1] = target;
        }
    }

}
