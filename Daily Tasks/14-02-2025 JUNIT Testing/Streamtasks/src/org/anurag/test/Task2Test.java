package org.anurag.test;

import org.anurag.Task2;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void testValidateNumberThrowsException() {
        Task2 task = new Task2();
        try {
            task.validateNumber(-1);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Number must be non-negative", e.getMessage());
        }
    }
}
