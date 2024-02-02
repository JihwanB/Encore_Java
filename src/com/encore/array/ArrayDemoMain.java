package com.encore.array;

public class ArrayDemoMain {
    public static void main(String[] args) {

        // ArrayDemo 에서 구현된 메서드 호출하고 싶다면?
        ArrayDemo demo = new ArrayDemo();
        int[] arr = demo.makeScores();
        System.out.println("Array address : " + arr);

        // 배열을 전달하여 총합과 평균을 출력
        demo.scorePrint(arr);

        System.out.println(">>> 랜덤 카드 게임 <<<");
        String[] shapes = {"spade", "clover", "heart", "diamond"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};

        int shapeIdx = (int) (Math.random() * shapes.length);
        int numberIdx = (int) (Math.random() * numbers.length);

        System.out.println("뽑은 카드는 : " + shapes[shapeIdx] + " " + numbers[numberIdx] + " 입니다.");

        System.out.println("주민번호를 입력받아서 성별자리 이후부터 '*'로 가려서 출력");
        String ssn = "730910-1234567";
        System.out.println("주민번호 : " + ssn);

        char[] charArr = ssn.toCharArray();
        System.out.println("arr length : " + charArr.length);
        System.out.println("arr gender : " + charArr[7]);

        for (int i = 0; i < charArr.length; i++) {
            if (i > 7) {
                charArr[i] = '*';
            }
        }

        System.out.print("Result : ");
        for (char c : charArr) {
            System.out.print(c);
        }

    }

}
