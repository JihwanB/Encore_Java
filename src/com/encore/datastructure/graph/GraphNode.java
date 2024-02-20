package com.encore.datastructure.graph;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class GraphNode {

    private int data;
    private boolean visited;
    private List<GraphNode> corLst;

    public GraphNode(int data) {
        this.data = data;
        this.visited = false;
        corLst = new ArrayList<>();
    }

}
