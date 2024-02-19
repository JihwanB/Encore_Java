package com.encore.datastructure.collection.list.linkedlist;

public class EncoreNodeList {
    private EncoreNode head;

    public EncoreNodeList(int data) {
        this.head = new EncoreNode(data);
    }

    public void add(int data) {
        if (this.head == null) {
            // 연결 리스트의 헤더가 생성되지 않은 상태
            this.head = new EncoreNode(data);
        } else {
            // 연결되어지는 노드를 생성
            EncoreNode current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new EncoreNode(data));
        }
    }

    public boolean remove(int data) {

        // 헤더를 삭제
        if (this.head.getData() == data) {
            EncoreNode temp = this.head;
            this.head = this.head.getNext();
            temp = null;
        } else {
            EncoreNode current = this.head;
            while (current.getNext() != null) {
                if (current.getNext().getData() == data) {
                    EncoreNode temp = current.getNext();
                    current.setNext(current.getNext().getNext());
                    temp = null;
                    return true;
                } else {
                    current = current.getNext();
                }
            }
        }
        return false;

    }

    public void desc() {
        EncoreNode node = this.head;
        while (node != null) {
            System.out.println("debug >>>> " + node.getData());
            node = node.getNext();
        }
    }

}
