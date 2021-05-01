package com.company.devices;

public class Diesel extends Car {
    public Diesel(String model, String producer, Integer yearofproduction, String color, Double value) {
        super(model, producer, yearofproduction, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano samochód Dieslem");
    }
}
