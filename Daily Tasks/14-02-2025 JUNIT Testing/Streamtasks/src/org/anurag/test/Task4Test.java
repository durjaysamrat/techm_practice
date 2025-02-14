package org.anurag.test;

import org.anurag.Task4;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Task4Test {
    private final int input;
    private final int expected;
    private final Task4 task = new Task4();

    public Task4Test(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
            {2, 4}, {3, 9}, {4, 16}, {-5, 25}, {0, 0}
        });
    }

    @Test
    public void testSquare() {
        assertEquals(expected, task.square(input));
    }
}
