package com.encore.lambda;

public class LambdaMain {

    public static void main(String[] args) {
        /*
        ILambda lambda = new ILambda() {
            @Override
            public void printInfo(String str) {
                System.out.println(str);
            }

            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };
        lambda.printInfo("hello~~~");
        System.out.println("add = " + lambda.add(10, 10));
         */

        /*
        ILambda lambda = (str) -> System.out.println(str);
        lambda.printInfo("hello");

        ILambda lambda = (x, y) -> x + y;;
        System.out.println(lambda.add(10, 10));
         */

        /*
        ILambda lambda = new LambdaImpl();
        lambda.printInfo("기존 코드 방식");
        int result = lambda.add(10, 10);
        System.out.println("add = " + result);
         */

        /*
        int addSum = result((x, y) -> x + y);
        System.out.println("add = " + addSum);
         */

        /*
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });
        thread.start();
         */

        /*
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        thread.start();
         */

        System.out.println(Operation.DIVIDE.apply(2, 3));

    }

    public static int result(ILambda lambda) {
        return lambda.add(10, 10);
    }

}
