package com.easyrentals.dao;

import com.easyrentals.model.Customer;
import com.easyrentals.model.PrivilegedCustomer;
import com.easyrentals.model.RegularCustomer;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class CustomerDao {
    public static List<Customer> getCustomerDetails() {
        PrivilegedCustomer c1 = new PrivilegedCustomer();
        c1.id = 101;
        c1.name = "Sita";
        c1.setDob(LocalDate.of(1975, 5, 12));
        c1.setGender("Female");
        c1.setContactNo("9876543210");
        c1.setEmailId("alice@example.com");
        c1.setRegistrationDate(LocalDate.of(2016, 3, 20));
        c1.setCountry("USA");
        //c1.setCustType("ER-R");

        RegularCustomer c2 = new RegularCustomer();
        c2.id = 102;
        c2.name = "Ramesh";
        c2.setDob(LocalDate.of(2000, 8, 25));
        c2.setGender("Male");
        c2.setContactNo("9123456780");
        c2.setEmailId(null); // Missing email
        c2.setRegistrationDate(LocalDate.of(2021, 6, 10));
        c2.setCountry("China");
        //c2.setCustType("ER-P");

        PrivilegedCustomer c3 = new PrivilegedCustomer();
        c3.id = 103;
        c3.name = "Geeta";
        c3.setDob(LocalDate.of(1960, 1, 15));
        c3.setGender("Female");
        c3.setContactNo("9234567812");
        c3.setEmailId("maria.gomez@domain.com");
        c3.setRegistrationDate(LocalDate.of(2019, 9, 5));
        c3.setCountry("Spain");
        //c3.setCustType("ER-R");

        RegularCustomer c4 = new RegularCustomer();
        c4.id = 104;
        c4.name = "Stark";
        c4.setDob(LocalDate.of(1985, 11, 3));
        c4.setGender("Male");
        c4.setContactNo("9345678912");
        c4.setEmailId(null); // Missing email
        c4.setRegistrationDate(LocalDate.of(2018, 7, 19));
        c4.setCountry("Germany");
        //c4.setCustType("ER-R");

        PrivilegedCustomer c5 = new PrivilegedCustomer();
        c5.id = 105;
        c5.name = "Thor";
        c5.setDob(LocalDate.of(1972, 4, 18));
        c5.setGender("Male");
        c5.setContactNo("9456781234");
        c5.setEmailId("jean.dupont@domain.com");
        c5.setRegistrationDate(LocalDate.of(2015, 2, 11));
        c5.setCountry("France");
        //c5.setCustType("ER-P");


        return Arrays.asList(c1, c2, c3, c4, c5);
    }
}


