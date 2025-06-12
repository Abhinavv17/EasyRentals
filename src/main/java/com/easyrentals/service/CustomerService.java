package com.easyrentals.service;

import com.easyrentals.dao.CustomerDao;
import com.easyrentals.model.Customer;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class CustomerService {
    public List<Customer> getAllSortedByDOB() {
        return CustomerDao.getCustomerDetails()
                .stream()
                .sorted(Comparator.comparing(Customer::getDob))
                .collect(Collectors.toList());
    }

    public List<Customer> getRegularChineseAdults() {
        return CustomerDao.getCustomerDetails()
                .stream()
                .filter(c -> "ER-R".equals(c.getCustType()))
                .filter(c -> "China".equalsIgnoreCase(c.getCountry()))
                .filter(c -> Period.between(c.getDob(), LocalDate.now()).getYears() > 18)
                .collect(Collectors.toList());
    }

    public long countAgeAbove50() {
        return CustomerDao.getCustomerDetails()
                .stream()
                .filter(c -> Period.between(c.getDob(), LocalDate.now()).getYears() >= 50)
                .count();
    }

    public List<Customer> getPrivilegedUSA() {
        return CustomerDao.getCustomerDetails()
                .stream()
                .filter(c -> c.getCustType().equals("ER-P"))
                .filter(c -> "USA".equalsIgnoreCase(c.getCountry()))
                .collect(Collectors.toList());
    }

    public double applyDiscountIfEligible(Customer c) {
        if (Period.between(c.getRegistrationDate(), LocalDate.now()).getYears() >= 5) {
            return 0.9; // 10% discount
        }
        return 1.0;
    }

    public String getFormattedDateInZone(Customer c, String zoneId) {
        return c.getRegistrationDate()
                .atStartOfDay(TimeZone.getTimeZone(zoneId).toZoneId())
                .toLocalDate()
                .toString();
    }

    public double getRentalPrice(Customer customer, double basePrice){
        return customer.calculateRentalPrice(basePrice);
    }
}
