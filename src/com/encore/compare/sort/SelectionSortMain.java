package com.encore.compare.sort;

public class SelectionSortMain {

    public static void main(String[] args) {

        // 10개의 방을 가지는 배열만들고 랜덤한(1~100) 값으로 초기화 후 정렬 전 출력
        int[] ary = new int[10];
        putRandomNumbers(ary);

        System.out.println(">>>> 정렬 전 출력 <<<<");
        aryPrint(ary);

        //int minIdx = findMinIdx(ary);
        //System.out.println("\n최소값을 가지는 배열의 인덱스 : " + minIdx);
        //System.out.println("최소값 : " + ary[minIdx]);

        selectionSort(ary);
        System.out.println("\n>>>> 정렬 후 출력 <<<<");
        aryPrint(ary);

    }

    // 정렬 전 배열의 값들을 출력
    public static void aryPrint(int[] ary) {
        for (int i : ary) {
            System.out.print(i + "\t");
        }
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

    public static int findMinIdx(int[] ary) {
        int minIdx = 0;
        for (int i = 1; i < ary.length; i++) {
            if (ary[minIdx] > ary[i]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }
    }

}
