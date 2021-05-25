package com.company.devices;

import com.company.Human;
import com.company.Transaction;

import java.util.ArrayList;

public abstract class Car extends Device implements com.company.Salleable, Comparable<Car> {
    public String color;
    public ArrayList<Transaction> transactions = new ArrayList<>();

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
        if (!seller.hasCar(this) && getCurrentOwner() != seller) {
            System.out.println(("Nie możesz sprzedać czegoś czego nie posiadasz"));
        } else if (!buyer.garageHasEmptyPlace()) {
            System.out.println(("Kupujący nie ma miejsca na nowy samochód"));
        } else if (buyer.cash < price) {
            System.out.println(("Nie stać cię!"));
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.addCar(this, seller, price);
            seller.removeCar(this);
            System.out.println(("Transakcja udana, sprzedano " + this + " za " + price));
        }
    }

    public void addTransaction(Human buyer, Double price) {
        transactions.add(new Transaction(buyer, price, new java.util.Date()));
    }

    public void addTransaction(Human buyer, Human seller, Double price) {
        transactions.add(new Transaction(buyer, seller, price, new java.util.Date()));
    }

    public Human getCurrentOwner() {
        if (transactions.isEmpty())
            return null;
        else
            return Transaction.getOwner(transactions.get(transactions.size() - 1));
    }

    public boolean wasOwner(Human human) {
        for (Transaction x : transactions) {
            if (x.wasOwner(human))
                return true;
        }
        return false;
    }

    public boolean sellerAndBuyer(Human seller, Human buyer) {
        for (Transaction x : transactions) {
            if (x.sellerAndBuyer(seller, buyer))
                return true;
        }
        return false;
    }

    public Integer transactionNumber() {
        return transactions.size();
    }

    @Override
    public int compareTo(Car car) {
        return this.yearofproduction - car.yearofproduction;
    }

    public abstract void refuel();
}
