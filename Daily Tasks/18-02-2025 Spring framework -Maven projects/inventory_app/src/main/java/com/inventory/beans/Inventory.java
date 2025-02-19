package com.inventory.beans;

public class Inventory {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    // Constructor Injection
    public Inventory(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    // Getter Methods
    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Price: " + itemPrice + ", Quantity: " + itemQuantity;
    }
}
