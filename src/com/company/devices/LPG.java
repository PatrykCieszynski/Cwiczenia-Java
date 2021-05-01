package com.company.devices;

public class LPG extends Car {
    public LPG(String model, String producer, Integer yearofproduction, String color, Double value) {
        super(model, producer, yearofproduction, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano samochód LPG");
    }
}
