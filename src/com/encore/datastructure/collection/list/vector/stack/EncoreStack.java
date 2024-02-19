package com.encore.datastructure.collection.list.vector.stack;

import java.util.EmptyStackException;

public class EncoreStack {

    private int[] stackAry;
    private int top;

    public EncoreStack() {
        stackAry = new int[6];
        top = -1;
    }

    public void push(int data) {
        stackAry[++top] = data;
    }

    public int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stackAry[top--];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public int peek() {
        return stackAry[top];
    }

    public void prtStack() {
        for (int i = top; i >= 0; i--) {
            System.out.print("[\t" + stackAry[i] + "\t]");
            if (stackAry[i] == stackAry[top]) {
                System.out.print("\t<- top");
            }
            System.out.println();
        }
    }

    public int size() {
        return top + 1;
    }

}
