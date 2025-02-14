package org.anurag.test;

import org.anurag.Task8;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task8Test {
    private final Task8 task = new Task8();

    @Test
    public void testGetSquare() {
        assertEquals("Expected square of 5 to be 25", 25, task.getSquare(5));
    }
}
