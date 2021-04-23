package com.company.devices;

public class Device {

    public final String model;
    public final String producer;
    public final Integer yearofproduction;

    public Device(String model, String producer, Integer yearofproduction) {
        this.model = model;
        this.producer = producer;
        this.yearofproduction = yearofproduction;
    }

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearofproduction=" + yearofproduction +
                '}';
    }

    public void turnOn() {
        System.out.println("Włączono urządzenie");
    }
}
