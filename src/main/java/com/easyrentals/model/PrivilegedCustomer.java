package com.easyrentals.model;

import java.time.LocalDate;
import java.time.Period;

public class PrivilegedCustomer extends Customer{
    public PrivilegedCustomer() {
        this.setCustType("ER-P");
    }

    @Override
    public double calculateRentalPrice(double basePrice) {
        return basePrice - calculateDiscount(basePrice);
    }

    public double calculateDiscount(double basePrice) {
        if (Period.between(this.getRegistrationDate(), LocalDate.now()).getYears() >= 5) {
            return basePrice * 0.10; // 10% discount
        }
        return 0.0;
    }
}

