package com.encore.collection.list.linkedlist;

@SuppressWarnings("ALL")
public class EncoreNode {

    private int data;
    private EncoreNode next;

    public EncoreNode(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(EncoreNode next) {
        this.next = next;
    }

    public EncoreNode getNext() {
        return this.next;
    }

}
