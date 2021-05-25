package com.company;

import com.company.creatures.Pet;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("dog", "Haiku");
        Pet dog2 = new Pet("dog", "Burek");
        Phone test = new Phone("Nokia", "3310", 1990, 5.0, "Android");
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed(15.0);
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        Diesel fiat = new Diesel("126p", "Fiat", 1960, "red", 2500.0);
        LPG polonez = new LPG("126p", "Fiat", 1970, "red", 2500.0);
        Electric tesla = new Electric("cośtam", "Tesla", 2020, "white", 9999.9);
        Human me = new Human("Patryk", "Cieszyński", "123456789", dog);

        me.getSalary();
        me.setSalary(3000);
        me.getSalary();

        System.out.println(me.getCar(1));
        me.setCar(fiat);
        System.out.println(me.getCar(1));

        System.out.println(fiat);
        System.out.println(test);
        test.turnOn();
        fiat.turnOn();
        me.cash = 150.0;
        Human brother = new Human("Patryk", "Cieszyński", "123456789", dog2);
        brother.cash = 125.0;
        me.pet.sell(me, brother, 20.0);
        System.out.println(("Mój garaż"));
        me.printGarage();
        System.out.println(("Drugi garaż"));
        brother.printGarage();
        me.garage[0].sell(me, brother, 50.0);
        System.out.println(("Mój garaż"));
        me.printGarage();
        System.out.println(("Drugi garaż"));
        brother.printGarage();
        brother.phone = test;
        brother.phone.sell(brother, me, 5.0);
        System.out.println(me.phone);

        fiat.refuel();
        polonez.refuel();
        tesla.refuel();

        me.garage[1] = polonez;
        me.garage[0] = tesla;
        System.out.println(me.getGarageValue());
        System.out.println(("Mój garaż"));
        me.printGarage();
        me.sortGarage();
        System.out.println(("Mój garaż"));
        me.printGarage();
    }
}
