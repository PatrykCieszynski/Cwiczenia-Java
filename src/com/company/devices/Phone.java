package com.company.devices;

import com.company.Human;

import java.net.URL;
import java.util.List;

public class Phone extends Device implements com.company.Salleable {
    final public Double screenSize;
    final public String operationSystem;
    private static final String DEFAULT_APP_SERVER_URL = "http://127.0.0.1/";
    private static final String DEFAULT_PROTOCOL = "3000";
    private static final String DEFAULT_VERSION_NAME = "1.6.3";

    public Phone(String model, String producer, Integer yearofproduction, Double screenSize, String operationSystem) {
        super(model, producer, yearofproduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("Podaj pin");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != this) {
            System.out.println(("Nie możesz sprzedać czegoś czego nie posiadasz"));
        } else if (buyer.cash < price) {
            System.out.println(("Nie stać cię!"));
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println(("Transakcja udana, sprzedano " + this + " za " + price));
        }
    }

    public void installAnApp(String appName) {

    }

    public void installAnApp(String appName, String appVersion) {

    }

    public void installAnApp(String appName, String appVersion, String appURL) {

    }

    public void installAnApp(List<String> appName) {

    }

    public void installAnApp(URL appURL) {

    }
}
