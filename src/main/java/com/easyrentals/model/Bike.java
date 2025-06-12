package com.easyrentals.model;

import java.time.LocalDate;

public class Bike {
        private int bikeId;
        private String serialNumber;
        private String bikeName;
        private double	rentPrice;
        private String	companyName;
        private LocalDate rentDate;

    public Bike(int bikeId, String serialNumber, String bikeName, double rentPrice, String companyName, LocalDate rentDate) {
        this.bikeId = bikeId;
        this.serialNumber = serialNumber;
        this.bikeName = bikeName;
        this.rentPrice = rentPrice;
        this.companyName = companyName;
        this.rentDate = rentDate;
    }



    //setters and getters

    public int getBikeId() {
        return bikeId;
    }

    public void setBikeId(int bikeId) {
        this.bikeId = bikeId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeId=" + bikeId +
                ", serialNumber='" + serialNumber + '\'' +
                ", bikeName='" + bikeName + '\'' +
                ", rentPrice=" + rentPrice +
                ", companyName='" + companyName + '\'' +
                ", rentDate=" + rentDate +
                '}';
    }
}


