package com.company.devices;

import com.company.Application;
import com.company.Human;

import java.util.ArrayList;
import java.util.HashSet;

public class Phone extends Device implements com.company.Salleable {
    final public Double screenSize;
    final public String operationSystem;
    public HashSet<Application> applications = new HashSet<>();
    Human owner;

    public Phone(String model, String producer, Integer yearofproduction, Double screenSize, String operationSystem) {
        super(model, producer, yearofproduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    public Phone(String model, String producer, Integer yearofproduction, Double screenSize, String operationSystem, Human owner) {
        super(model, producer, yearofproduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
        this.owner = owner;
        owner.setPhone(this);
    }

    @Override
    public void turnOn() {
        System.out.println("Podaj pin");
    }

    public static void findFreeApps() {
        for (Application app : Application.allApplications) {
            if (app.getPrice() == 0)
                System.out.println(app.getName());
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != this)
            System.out.println(("Nie możesz sprzedać czegoś czego nie posiadasz"));
        else if (buyer.cash < price)
            System.out.println(("Nie stać cię!"));
        else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println(("Transakcja udana, sprzedano " + this + " za " + price));
            this.owner = buyer;
        }
    }

    public void installApp(Application app) {
        if (this.owner.getCash() < app.getPrice())
            System.out.println("Nie stać cię!");
        else {
            applications.add(app);
            owner.pay(app.getPrice());
            System.out.println("Transakcja udana, zainstalowano " + app);
        }
    }

    public boolean checkIfInstalled(Application app) {
        return applications.contains(app);
    }

    public boolean checkIfInstalled(String name) {
        for (Application app : applications) {
            if (app.getName().equals(name))
                return true;
        }
        return false;
    }

    public Double checkAppsValue() {
        Double val = 0.0;
        for (Application app : applications) {
            val += app.getPrice();
        }
        return val;
    }

    public void appSortByName() {
        ArrayList<Application> list = new ArrayList<>(applications);
        list.sort(Application.sortByName);
        System.out.println(list);

    }

    public void appSortByPrice() {
        ArrayList<Application> list = new ArrayList<>(applications);
        list.sort(Application.sortByPrice);
        System.out.println(list);
    }

}
