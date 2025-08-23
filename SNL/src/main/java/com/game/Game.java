package com.game;

public class Game {
    private final Board board;
    private final Dice dice;
    private final Player player;

    public Game(Board board, Dice dice, Player player) {
        this.board = board;
        this.dice = dice;
        this.player = player;
    }

    public boolean playTurn() {
        int roll = dice.roll();
        int newPos = board.getNewPosition(player.getPosition(), roll);
        player.move(newPos);

        return newPos == board.getSize();
    }
}
