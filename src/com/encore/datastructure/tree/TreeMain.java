package com.encore.datastructure.tree;

public class TreeMain {

    public static void main(String[] args) {

        TreeServiceImpl service = new TreeServiceImpl();

        /*
        TreeNode node50 = service.makeTree(50, null, null);
        TreeNode node60 = service.makeTree(60, null, null);
        TreeNode node55 = service.makeTree(55, node50, node60);
        TreeNode node70 = service.makeTree(70, null, null);
        TreeNode node65 = service.makeTree(65, node55, node70);

        System.out.println("데이터가 55인 노드의 left 데이터를 확인 -> " + node55.getLeftNode().getData());
        System.out.println("데이터가 55인 노드의 right 데이터를 확인 -> " + node55.getRightNode().getData());
        */

        // leaf node
        TreeNode node11 = new TreeNode(11, null, null);
        TreeNode node10 = new TreeNode(10, null, null);
        TreeNode node9 = new TreeNode(9, null, null);
        TreeNode node8 = new TreeNode(8, null, null);
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);

        TreeNode node5 = new TreeNode(5, node11, null);
        TreeNode node4 = new TreeNode(4, node9, node10);
        TreeNode node3 = new TreeNode(3, node7, node8);
        TreeNode node2 = new TreeNode(2, node5, node6);
        TreeNode node1 = new TreeNode(1, node3, node4);

        // root node
        TreeNode node0 = new TreeNode(0, node1, node2);
        
        System.out.println();
        System.out.println(">>>> preOrder ");
        service.preOrder(node0);

        System.out.println();
        System.out.println(">>>> inOrder ");
        service.inOrder(node0);

        System.out.println();
        System.out.println(">>>> postOrder ");
        service.postOrder(node0);

    }

}
