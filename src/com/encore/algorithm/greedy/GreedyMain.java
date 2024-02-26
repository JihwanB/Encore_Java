package com.encore.algorithm.greedy;

import java.util.*;

public class GreedyMain {

    public static void main(String[] args) {

        List<GreedyNode> lst = new ArrayList<>();
        lst.add(new GreedyNode("A", 7, 8));
        lst.add(new GreedyNode("B", 5, 7));
        lst.add(new GreedyNode("C", 3, 6));
        lst.add(new GreedyNode("D", 1, 2));
        lst.add(new GreedyNode("E", 6, 9));
        lst.add(new GreedyNode("F", 10, 11));

        Collections.sort(lst);

        // Greedy algorithm 수행 후 결과 출력 (활동 명)
        List<GreedyNode> results = process(lst);
        printResults(results);

    }

    private static List<GreedyNode> process(List<GreedyNode> lst) {
        List<GreedyNode> results = new ArrayList<>();
        Iterator<GreedyNode> iter = lst.iterator();

        int prevEndTime = 0;
        while (iter.hasNext()) {
            GreedyNode node = iter.next();
            if (prevEndTime <= node.getStartTime()) {
                results.add(node);
                prevEndTime = node.getEndTime();
            }
        }

        return results;
    }

    private static void printResults(List<GreedyNode> results) {
        for (GreedyNode node : results) {
            System.out.print(node.getActivityName() + "\t");
        }
    }

}
