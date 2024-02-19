package com.encore.datastructure.tree;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class TreeNode {

    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.leftNode = left;
        this.rightNode = right;
    }

}
