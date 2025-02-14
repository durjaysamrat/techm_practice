package org.anurag.test;

import org.anurag.Task5;
import org.junit.Test;

public class Task5Test {
    private final Task5 task = new Task5();

    @Test(timeout = 300) // Test fails if execution time exceeds 300ms
    public void testDelayedMethodTimeout() {
        task.delayedMethod();
    }
}
