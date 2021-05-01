package com.company.devices;

import com.company.Human;

public abstract class Car extends Device implements com.company.Salleable {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.car != this) {
            System.out.println(("Nie możesz sprzedać czegoś czego nie posiadasz"));
        } else if (buyer.cash < price) {
            System.out.println(("Nie stać cię!"));
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.car = seller.car;
            seller.car = null;
            System.out.println(("Transakcja udana, sprzedano " + this + " za " + price));
        }
    }

    public abstract void refuel();
}
