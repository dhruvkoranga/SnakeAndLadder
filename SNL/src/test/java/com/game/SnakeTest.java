package com.game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SnakeTest {

    @Test
    void testSnakeHeadAndTail() {
        Snake snake = new Snake(36, 19);
        assertEquals(36, snake.getHead());
        assertEquals(19, snake.getTail());
    }

    @Test
    void testInvalidSnakeThrowsError() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Snake(10, 20));
        assertEquals("Snake tail must be below head", ex.getMessage());
    }

}
