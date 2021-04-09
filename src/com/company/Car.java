package com.company;

public class Car {
    public final String model;
    public final String producer;
    public String color;
    public Double value;

    public Car(String model, String producer, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "\nmodel='" + model + '\'' +
                ", \nproducer='" + producer + '\'' +
                ", \ncolor='" + color + '\'' +
                ", \nvalue=" + value +
                '}';
    }
}
