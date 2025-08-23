package com.game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    void testInitialPositionIsZero() {
        Player player = new Player("Alice");
        assertEquals(0, player.getPosition());
    }

    @Test
    void testMovePlayer() {
        Player player = new Player("Bob");
        player.move(10);
        assertEquals(10, player.getPosition());
    }

    @Test
    void testPlayerNameStoredCorrectly() {
        Player player = new Player("Charlie");
        assertEquals("Charlie", player.getName());
    }
}

