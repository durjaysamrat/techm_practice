package com.loan.beans;

public class Loan {
    private double amount;
    private double interestRate;
    private int duration; // in years

    // Constructor
    public Loan(double amount, double interestRate, int duration) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    // Getter and Setter Methods
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Loan Amount: " + amount + ", Interest Rate: " + interestRate + "%, Duration: " + duration + " years";
    }
}
