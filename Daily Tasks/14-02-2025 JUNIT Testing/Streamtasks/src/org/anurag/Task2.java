package org.anurag;

public class Task2 {
    public void validateNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
    }
}

