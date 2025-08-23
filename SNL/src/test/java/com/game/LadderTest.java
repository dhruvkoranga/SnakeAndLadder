package com.game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LadderTest {

    @Test
    void testSnakeHeadAndTail() {
        Ladder ladder = new Ladder(7, 33);
        assertEquals(7, ladder.getStart());
        assertEquals(33, ladder.getEnd());
    }

    @Test
    void testInvalidLadderThrowsError() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Ladder(20, 10));
        assertEquals("Ladder end must be above start", ex.getMessage());
    }


}
