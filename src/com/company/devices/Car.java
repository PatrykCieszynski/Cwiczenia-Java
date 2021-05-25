package com.company.devices;

import com.company.Human;

public abstract class Car extends Device implements com.company.Salleable, Comparable<Car> {
    public String color;

    public Car(String model, String producer, Integer yearofproduction, String color, Double value) {
        super(model, producer, yearofproduction, value);
        this.color = color;
    }

    @Override
    public void turnOn() {
        System.out.println("Przekręcam kluczyk");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (!seller.hasCar(this)) {
            System.out.println(("Nie możesz sprzedać czegoś czego nie posiadasz"));
        } else if (!buyer.garageHasEmptyPlace()) {
            System.out.println(("Kupujący nie ma miejsca na nowy samochód"));
        } else if (buyer.cash < price) {
            System.out.println(("Nie stać cię!"));
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.addCar(this);
            seller.removeCar(this);
            System.out.println(("Transakcja udana, sprzedano " + this + " za " + price));
        }
    }

    @Override
    public int compareTo(Car car) {
        return this.yearofproduction - car.yearofproduction;
    }

    public abstract void refuel();
}
