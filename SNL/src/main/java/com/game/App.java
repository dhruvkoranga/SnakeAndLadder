package com.game;

import java.util.Arrays;
import java.util.Scanner;

public class App 
{   public static void main(String[] args) {
    Board board = new Board(
            100,
            Arrays.asList(
                    new Snake(36, 19),
                    new Snake(65, 35),
                    new Snake(87, 32),
                    new Snake(97, 78)
            ),
            Arrays.asList(
                    new Ladder(7, 33),
                    new Ladder(37, 85),
                    new Ladder(51, 72),
                    new Ladder(68, 90)
            )
    );

    Player player = new Player("Alice");
    Dice dice = new Dice();
    Game game = new Game(board, dice, player);

    Scanner scanner = new Scanner(System.in);
    System.out.println("🎲 Welcome to Snakes & Ladders!");
    System.out.println("Player: " + player.getName());

    boolean won = false;
    while (!won) {
        System.out.print("Press ENTER to roll the dice...");
        scanner.nextLine();

        won = game.playTurn();
        System.out.println(player.getName() + " is now at position " + player.getPosition());

        if (won) {
            System.out.println("🎉 Yay!! " + player.getName() + " won the game!");
        }
    }
    scanner.close();
}
}
