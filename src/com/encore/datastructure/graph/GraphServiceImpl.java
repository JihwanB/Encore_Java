package com.encore.datastructure.graph;

import lombok.NoArgsConstructor;

import java.util.*;

@NoArgsConstructor
public class GraphServiceImpl {

    public GraphNode makeNode(int data) {
        return new GraphNode(data);
    }

    public void makeEdge(GraphNode fromNode, GraphNode toNode) {
        fromNode.getCorLst().add(toNode);
    }

    // 재귀호출 필요
    // Iterator 사용
    // 방문(visited) 체크
    public void dfs(GraphNode node) {
        System.out.print(node.getData() + "\t");
        node.setVisited(true);

        ListIterator<GraphNode> iter = node.getCorLst().listIterator();
        while (iter.hasNext()) {
            GraphNode data = iter.next();
            if (!data.isVisited()) {
                dfs(data);
            }
        }
    }

    public void bfs(int[][] ary, boolean[] visit) {
        Queue<Integer> queue = new LinkedList<>();

        // 데이터이면서 2차원 배열의 행 인덱스
        queue.offer(1);
        visit[1] = true;

        while (!queue.isEmpty()) {
            int row_data = queue.poll();
            System.out.print(row_data + "\t");
            for (int i = 0; i < ary[row_data].length; i++) {
                // 데이터이지만 인덱스로 사용
                int temp = ary[row_data][i];
                if (!visit[temp]) {
                    visit[temp] = true;
                    queue.offer(temp);
                }
            }
        }

    }

    public void bfs(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();

        queue.offer(node);
        boolean[] visit = new boolean[9];
        visit[node.getData()] = true;

        while (!queue.isEmpty()) {
            GraphNode g = queue.poll();
            System.out.print(g.getData() + "\t");
            for (int i = 0; i < g.getCorLst().size(); i++) {
                // 데이터이지만 인덱스로 사용
                GraphNode data = g.getCorLst().get(i);
                if (!visit[data.getData()]) {
                    visit[data.getData()] = true;
                    queue.offer(data);
                }
            }
        }
    }

}
