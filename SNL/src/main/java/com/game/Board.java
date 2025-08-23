package com.game;

import lombok.Getter;

import java.util.List;

public class Board {
    @Getter
    private final int size;
    private final List<Snake> snakes;
    private final List<Ladder> ladders;

    public Board(int size, List<Snake> snakes, List<Ladder> ladders) {
        this.size = size;
        this.snakes = snakes;
        this.ladders = ladders;
    }

    public int getNewPosition(int currentPosition, int diceValue) {
        int tentative = currentPosition + diceValue;

        if (tentative > size) {
            return currentPosition;
        }

        for (Ladder ladder : ladders) {
            if (ladder.getStart() == tentative) {
                return ladder.getEnd();
            }
        }

        for (Snake snake : snakes) {
            if (snake.getHead() == tentative) {
                return snake.getTail();
            }
        }

        return tentative;
    }

}
