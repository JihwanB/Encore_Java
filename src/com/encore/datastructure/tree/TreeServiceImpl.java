package com.encore.datastructure.tree;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TreeServiceImpl {

    public TreeNode makeTree(int data, TreeNode left, TreeNode right) {
        return new TreeNode(data, left, right);
    }

    // 전위순회 (뿌리 -> 왼쪽 자식 -> 오른쪽 자식)
    public void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + "\t");
            preOrder(node.getLeftNode());
            preOrder(node.getRightNode());
        }
    }

    // 중위순회 (왼쪽 자식 -> 뿌리 -> 오른쪽 자식)
    public void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.getLeftNode());
            System.out.print(node.getData() + "\t");
            inOrder(node.getRightNode());
        }
    }


    // 후위순회 (왼쪽 자식 -> 오른쪽 자식 -> 뿌리)
    public void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.getLeftNode());
            postOrder(node.getRightNode());
            System.out.print(node.getData() + "\t");
        }
    }


}
