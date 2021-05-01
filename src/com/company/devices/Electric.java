package com.company.devices;

public class Electric extends Car {

    public Electric(String model, String producer, Integer yearofproduction, String color, Double value) {
        super(model, producer, yearofproduction, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("Naładowano samochód");
    }
}
