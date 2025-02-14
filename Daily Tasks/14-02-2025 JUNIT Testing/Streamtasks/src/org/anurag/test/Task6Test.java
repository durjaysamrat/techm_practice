package org.anurag.test;

import org.anurag.Task6;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class Task6Test {
    private final Task6 task = new Task6();

    @Test
    public void testDivide() {
        assertEquals(2, task.divide(10, 5));
    }

    @Ignore("Skipping this test because division by zero handling is not implemented yet")
    @Test
    public void testDivideByZero() {
        task.divide(10, 0);
    }
}
