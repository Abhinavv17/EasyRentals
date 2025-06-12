package com.easyrentals.dao;

import com.easyrentals.model.Bike;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class BikeDao {
    public static List<Bike> getBikeDetails() {
        return Arrays.asList(
                new Bike(1001, "Hon:1001", "CBR", 500.0, "Honda", LocalDate.now()),
                new Bike(1002, "Her:1002", "CBZ", 800.0, "Hero", LocalDate.now()),
                new Bike(1003, "Enf:1003", "Bullet", 900.0, "Enfield", LocalDate.now()),
                new Bike(1004, "Her:1004", "Karizma", 700.0, "Hero", LocalDate.now())
        );
    }
}


