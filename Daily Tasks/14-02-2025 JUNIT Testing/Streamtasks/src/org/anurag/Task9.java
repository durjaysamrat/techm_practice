package org.anurag;

public class Task9 {
    private static volatile Task9 instance;

    private Task9() {}

    public static Task9 getInstance() {
        if (instance == null) {
            synchronized (Task9.class) {
                if (instance == null) {
                    instance = new Task9();
                }
            }
        }
        return instance;
    }
}
