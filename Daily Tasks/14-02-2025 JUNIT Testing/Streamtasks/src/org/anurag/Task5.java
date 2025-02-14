package org.anurag;

public class Task5 {
    public void delayedMethod() {
        try {
            Thread.sleep(500); // Simulating delay of 500ms
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
