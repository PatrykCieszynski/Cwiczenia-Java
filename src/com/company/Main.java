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
        dog.feed(15.0);
        dog.takeForAWalk();

        Diesel fiat = new Diesel("126p", "Fiat", 1960, "red", 2500.0);
        LPG polonez = new LPG("126p", "Fiat", 1970, "red", 2500.0);
        Electric tesla = new Electric("cośtam", "Tesla", 2020, "white", 9999.9);
        Human me = new Human("Patryk", "Cieszyński", "123456789", dog);

        me.setSalary(3000);

        me.buyCar(fiat);
        me.cash = 150.0;
        Human brother = new Human("Jan", "Nowak", "123456789", dog2);
        brother.cash = 125.0;
        me.pet.sell(me, brother, 20.0);
        me.garage[0].sell(me, brother, 50.0);

        brother.phone = test;
        brother.phone.sell(brother, me, 5.0);

        me.addCar(polonez);
        me.addCar(tesla);
        System.out.println(polonez.getCurrentOwner());
        System.out.println(fiat.wasOwner(me));
        System.out.println(polonez.wasOwner(brother));
        System.out.println(fiat.sellerAndBuyer(me, brother));
        System.out.println(fiat.transactionNumber());
        System.out.println(polonez.transactionNumber());
        System.out.println(fiat.owners);
    }
}
