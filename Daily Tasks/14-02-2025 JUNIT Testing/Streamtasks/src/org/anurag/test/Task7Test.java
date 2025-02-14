package org.anurag.test;

import org.anurag.Task7;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task7Test {
    private final Task7 task = new Task7();

    @Test
    public void testAdd() {
        int result = task.add(3, 4);
        assertEquals("Expected sum of 3 and 4 to be 7", 7, result);
    }

    @Test
    public void testIsPositive() {
        assertTrue("Expected 5 to be positive", task.isPositive(5));
        assertFalse("Expected -3 to be non-positive", task.isPositive(-3));
    }
}
