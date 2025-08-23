package com.game;

import lombok.Getter;

@Getter
public class Snake {
    private final int head;
    private final int tail;

    public Snake(int head, int tail) {
        if (tail >= head) {
            throw new IllegalArgumentException("Snake tail must be below head");
        }

        this.head = head;
        this.tail = tail;
    }

}
