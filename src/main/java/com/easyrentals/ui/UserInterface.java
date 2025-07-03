package com.easyrentals.ui;

import com.easyrentals.dao.BikeDao;
import com.easyrentals.dao.CustomerDao;
import com.easyrentals.model.Bike;
import com.easyrentals.model.Customer;
import com.easyrentals.service.CustomerService;
import java.time.LocalDate;

import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserInterface {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        List<Customer> allCustomers = CustomerDao.getCustomerDetails();

        System.out.println("===== Available Bike Details =====");
        for (Bike bike : BikeDao.getBikeDetails()) {
            System.out.println(bike);
        }

        System.out.println("\n===== All Customers Sorted by DOB =====");
        service.getAllSortedByDOB()
                .forEach(c -> System.out.println(c.name + " | DOB: " + c.getDob()));

        System.out.println("\n===== Regular Customers from China (Age > 18) =====");
        service.getRegularChineseAdults()
                .forEach(c -> System.out.println(c.name + " | Country: " + c.getCountry() + " | Age: " +
                        java.time.Period.between(c.getDob(), java.time.LocalDate.now()).getYears()));

        System.out.println("\n===== Count of Customers Aged 50+ =====");
        long count = service.countAgeAbove50();
        System.out.println("Total: " + count);

        System.out.println("\n===== Privileged Customers from USA =====");
        service.getPrivilegedUSA()
                .forEach(c -> System.out.println(c.name + " | Country: " + c.getCountry()));

        System.out.println("\n===== Registration Date in Asia/Kolkata Timezone =====");
        allCustomers.stream()
                .forEach(c -> {
                    String dateInZone = service.getFormattedDateInZone(c, "Asia/Kolkata");
                    System.out.println(c.name + " | IST Registration Date: " + dateInZone);
                });

        System.out.println("\n===== Final Rental Price Calculation (Base ₹1000) =====");
        double basePrice = 1000.0;
        allCustomers.stream()
                .forEach(c -> {
                    double finalPrice = service.getRentalPrice(c, basePrice);
                    System.out.println(c.name + " | Final Rent: ₹" + finalPrice);
                });

        System.out.println("\n===== Customers Eligible for 10% Discount (Registered 5+ years ago) =====");
        allCustomers.stream()
                .filter(c -> service.applyDiscountIfEligible(c) == 0.9)
                .forEach(c -> System.out.println(c.name + " | Registered on: " + c.getRegistrationDate()));
    }
}
