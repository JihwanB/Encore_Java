package com.encore.compare;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class EncoreInteger implements Comparable<EncoreInteger> {

    private int data;

    @Override
    public int compareTo(EncoreInteger o) {
        return this.data - o.data;
    }
}
