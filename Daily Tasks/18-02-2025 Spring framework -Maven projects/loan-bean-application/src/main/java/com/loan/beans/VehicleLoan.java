package com.loan.beans;

public class VehicleLoan extends Loan {
    private String vehicleType;

    // Constructor
    public VehicleLoan(double amount, double interestRate, int duration, String vehicleType) {
        super(amount, interestRate, duration);
        this.vehicleType = vehicleType;
    }

    // Getter and Setter for vehicleType
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Vehicle Type: " + vehicleType;
    }
}
