package com.game;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {
    private Board board;
    private Player player;
    private Dice dice;
    private Game game;

    @BeforeEach
    void setup() {
        board = new Board(
                100,
                Arrays.asList(new Snake(36, 19), new Snake(65, 35)),
                Arrays.asList(new Ladder(7, 33), new Ladder(51, 72))
        );
        player = new Player("Alice");
        dice = Mockito.mock(Dice.class);
        game = new Game(board, dice, player);
    }

    @Test
    void testNormalMove() {
        Mockito.when(dice.roll()).thenReturn(3);
        game.playTurn();
        assertEquals(3, player.getPosition());
    }

    @Test
    void testClimbLadder() {
        // Start at 6, roll 1 → lands on 7 → ladder to 33
        player.move(6);
        Mockito.when(dice.roll()).thenReturn(1);
        game.playTurn();
        assertEquals(33, player.getPosition());
    }

    @Test
    void testSnakeBite() {
        // Start at 35, roll 1 → lands on 36 → snake to 19
        player.move(35);
        Mockito.when(dice.roll()).thenReturn(1);
        game.playTurn();
        assertEquals(19, player.getPosition());
    }

    @Test
    void testRollBeyond100StaysSame() {
        player.move(98);
        Mockito.when(dice.roll()).thenReturn(5); // 98 + 5 = 103 (invalid)
        game.playTurn();
        assertEquals(98, player.getPosition());
    }

    @Test
    void testWinAt100() {
        player.move(95);
        Mockito.when(dice.roll()).thenReturn(5); // 95 + 5 = 100
        boolean won = game.playTurn();
        assertTrue(won);
        assertEquals(100, player.getPosition());
    }
}
