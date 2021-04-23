package com.company.devices;

public class Car extends Device {
    public String color;
    public Double value;

    public Car(String model, String producer, Integer yearofproduction, String color, Double value) {
        super(model, producer, yearofproduction);
        this.color = color;
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Przekręcam kluczyk");
    }

}
