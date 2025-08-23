package com.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    private Board board;

    @BeforeEach
    void setup() {
        List<Snake> snakes = Arrays.asList(new Snake(36, 19), new Snake(65, 35));
        List<Ladder> ladders = Arrays.asList(new Ladder(7, 33), new Ladder(51, 72));
        board = new Board(100, snakes, ladders);
    }

    @Test
    void testNormalMoveWithoutSnakeOrLadder() {
        int newPos = board.getNewPosition(10, 3);
        assertEquals(13, newPos);
    }

    @Test
    void testLandingOnLadderMovesUp() {
        int newPos = board.getNewPosition(6, 1);
        assertEquals(33, newPos);
    }

    @Test
    void testLandingOnSnakeMovesDown() {
        int newPos = board.getNewPosition(35, 1);
        assertEquals(19, newPos);
    }

    @Test
    void testMoveBeyondBoardLimitStaysSame() {
        int newPos = board.getNewPosition(98, 5);
        assertEquals(98, newPos);
    }

    @Test
    void testExactLandingOn100Wins() {
        int newPos = board.getNewPosition(95, 5);
        assertEquals(100, newPos);
    }
}
