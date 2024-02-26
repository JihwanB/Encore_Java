package com.encore.algorithm.greedy;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class GreedyNode implements Comparable<GreedyNode> {

    private String activityName;
    private int startTime;
    private int endTime;

    @Override
    public int compareTo(GreedyNode o) {
        if (this.endTime == o.endTime)
            return this.startTime - o.startTime;
        return this.endTime - o.endTime;
    }

}
