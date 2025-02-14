package org.anurag.test;

import org.anurag.Task3;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task3Test {
    private Task3 task;

    @Before
    public void setUp() {
        task = new Task3();
        System.out.println("Setup: Creating Task3 instance");
    }

    @After
    public void tearDown() {
        task = null;
        System.out.println("Teardown: Cleaning up resources");
    }

    @Test
    public void testMultiply() {
        assertEquals(20, task.multiply(4, 5));
    }

    @Test
    public void testIsEven() {
        assertTrue(task.isEven(8));
        assertFalse(task.isEven(7));
    }
}
