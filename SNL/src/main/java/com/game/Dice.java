package com.game;

import java.util.Random;

public class Dice {
    private final Random random;

    public Dice() {
        this.random = new Random();
    }

    public Dice(Random random) {
        this.random = random;
    }

    public int roll() {
        return random.nextInt(6) + 1;
    }
}
