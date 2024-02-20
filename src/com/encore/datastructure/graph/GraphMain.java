package com.encore.datastructure.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphMain {

    public static void main(String[] args) {

        GraphServiceImpl service = new GraphServiceImpl();
        /*
        GraphNode node1 = service.makeNode(1);
        GraphNode node2 = service.makeNode(2);
        GraphNode node3 = service.makeNode(3);
        GraphNode node4 = service.makeNode(4);
        GraphNode node5 = service.makeNode(5);
        GraphNode node6 = service.makeNode(6);

        service.makeEdge(node1, node2);
        service.makeEdge(node2, node4);
        service.makeEdge(node4, node3);
        service.makeEdge(node3, node5);
        service.makeEdge(node3, node6);
        service.makeEdge(node5, node4);
        service.makeEdge(node4, node1);

        System.out.println("DFS");
        service.dfs(node1);
         */

        System.out.println("BFS");
        // 1 ~ 8 노드 생성
        // 생성한 (1 ~ 8) 노드의 연결
        // 1. 배열    2 .GraphNode
        int[][] ary = {{}, {2, 3, 7}, {1, 3, 5}, {1, 2}, {6, 8}, {2}, {4, 7, 8}, {1, 6}, {4, 6}};
        boolean[] visit = new boolean[9];
        service.bfs(ary, visit);

        System.out.println("\n>>>> GraphNode version ");
        GraphNode node1 = service.makeNode(1);
        GraphNode node2 = service.makeNode(2);
        GraphNode node3 = service.makeNode(3);
        GraphNode node4 = service.makeNode(4);
        GraphNode node5 = service.makeNode(5);
        GraphNode node6 = service.makeNode(6);
        GraphNode node7 = service.makeNode(7);
        GraphNode node8 = service.makeNode(8);

        service.makeEdge(node1, node2);service.makeEdge(node1, node3);service.makeEdge(node1, node7);
        service.makeEdge(node2, node1);service.makeEdge(node2, node3);service.makeEdge(node2, node5);
        service.makeEdge(node3, node1);service.makeEdge(node3, node2);
        service.makeEdge(node4, node6);service.makeEdge(node4, node8);
        service.makeEdge(node5, node2);
        service.makeEdge(node6, node4);service.makeEdge(node6, node7);service.makeEdge(node6, node8);
        service.makeEdge(node7, node1);service.makeEdge(node7, node6);
        service.makeEdge(node8, node4);service.makeEdge(node8, node6);

        service.bfs(node1);

    }

}
