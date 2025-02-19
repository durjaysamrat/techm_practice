package com.loan.beans;

public class HousingLoan extends Loan {
    private String propertyType;

    // Constructor
    public HousingLoan(double amount, double interestRate, int duration, String propertyType) {
        super(amount, interestRate, duration);
        this.propertyType = propertyType;
    }

    // Getter and Setter for propertyType
    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Property Type: " + propertyType;
    }
}
