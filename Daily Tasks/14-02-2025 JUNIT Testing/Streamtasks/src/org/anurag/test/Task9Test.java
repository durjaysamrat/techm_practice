package org.anurag.test;

import org.anurag.Task9;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.*;

public class Task9Test {
    @Test
    public void testSingletonThreadSafety() throws Exception {
        Callable<Task9> task = Task9::getInstance;
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<Task9> future1 = executor.submit(task);
        Future<Task9> future2 = executor.submit(task);
        Future<Task9> future3 = executor.submit(task);

        Task9 instance1 = future1.get();
        Task9 instance2 = future2.get();
        Task9 instance3 = future3.get();

        executor.shutdown();

        assertSame("All instances should be the same", instance1, instance2);
        assertSame("All instances should be the same", instance2, instance3);
    }
}
