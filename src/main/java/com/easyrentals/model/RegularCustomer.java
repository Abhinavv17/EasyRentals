package com.easyrentals.model;

public class RegularCustomer extends Customer {

    public RegularCustomer() {
        this.setCustType("ER-R");
    }

    @Override
    public double calculateRentalPrice(double basePrice) {
        return basePrice; // No discount
    }
}

