package com.encore.datastructure.collection.list.vector.stack;

public class StackDemoMain {

    public static void main(String[] args) {

        /* ex01
        Stack<Integer> stack = new Stack<>();
        stack.push(10); stack.push(20); stack.push(30); stack.add(40);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);
         */

        /* ex02
        Stack<String> stack = new Stack<>();
        System.out.println("empty : " + stack.empty());
        System.out.println("empty : " + stack.isEmpty());
        System.out.println("스택의 데이터가 없을 때 입력하고 싶다면? ");
        if (stack.empty()) {
            stack.push("One");
            stack.push("Two");
            stack.push("Three");
        }
        System.out.println(stack);
        stack.add(0, "Four"); // LIFO 구조가 무너짐
        System.out.println(stack);
        String str = stack.pop();
        System.out.println("pop : " + str);
        System.out.println(str.equals("Four"));
        System.out.println("size : " + stack.size());
        System.out.println(stack);
        System.out.println("search : " + stack.search("One")); // 1-base 로 꺼내질 값의 순서
        System.out.println("search : " + stack.search("Four"));
         */

        EncoreStack stack = new EncoreStack();
        // System.out.println(stack.pop());

        stack.push(10);
        stack.push(9);
        stack.push(8);
        stack.push(7);

        stack.prtStack();
        System.out.println();

        if (stack.isEmpty()) {
            System.out.println("스택이 비어있습니다.");
        } else {
            System.out.println("pop : " + stack.pop());
        }

        System.out.println();
        stack.prtStack();

        System.out.println("\npeek : " + stack.peek() + "\n");
        stack.prtStack();

        System.out.println("\nsize : " + stack.size());
    }

}
