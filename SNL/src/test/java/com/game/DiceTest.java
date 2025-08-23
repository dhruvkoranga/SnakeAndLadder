package com.game;

import org.junit.jupiter.api.Test;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class DiceTest {
    @Test
    void testDiceRollAlwaysThree() {
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(6)).thenReturn(2);

        Dice dice = new Dice(mockRandom);
        assertEquals(3, dice.roll());
        assertEquals(3, dice.roll());
    }
}
