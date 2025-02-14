package org.anurag.test;

import org.anurag.Task1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task1Test {  // Class must be public

    @Test
    public void testAddNumbers() {  // Method must be public
        Task1 task = new Task1();
        int result = task.addNumbers(5, 3);

        // Correct JUnit 4 syntax (expected value first, then actual)
        assertEquals(8, result);
    }
}
