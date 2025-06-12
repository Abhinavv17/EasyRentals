package com.easyrentals.ui;

import com.easyrentals.dao.BikeDao;
import com.easyrentals.model.Bike;

public class UserInterface {
    public static void main(String[] args) {
        for (Bike bike: BikeDao.getBikeDetails()){
            System.out.println(bike);
        }
    }
}
