package org.anurag.test;

import org.anurag.Task10;
import org.anurag.Task10Repository;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task10Test {
    private final Task10Repository repository = new Task10Repository();
    private final Task10 service = new Task10(repository);

    @Test
    public void testProcessAndSave() {
        String result = service.processAndSave(1, "hello");
        assertEquals("HELLO", result);
        assertEquals("HELLO", service.getProcessedValue(1));
    }

    @Test
    public void testRetrieveNonExisting() {
        assertNull("Should return null for non-existing ID", service.getProcessedValue(99));
    }
}
