package com.game;

import lombok.Getter;

@Getter
public class Ladder {
    private final int start;
    private final int end;

    public Ladder(int start, int end) {
        if (end <= start) {
            throw new IllegalArgumentException("Ladder end must be above start");
        }

        this.start = start;
        this.end = end;
    }

}
