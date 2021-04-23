package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", "Haiku");
        Phone test = new Phone("Nokia", "3310", 1990, 5.0, "Android");
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        Car fiat = new Car("126p", "Fiat", 1960, "red", 2500.0);
        Car polonez = new Car("126p", "Fiat", 1970, "red", 2500.0);
        Human me = new Human("Patryk", "Cieszyński", "123456789", dog);

        me.getSalary();
        me.setSalary(3000);
        me.getSalary();

        System.out.println(me.getCar());
        me.setCar(fiat);
        System.out.println(me.getCar());

        System.out.println(fiat);
        System.out.println(test);
        test.turnOn();
        fiat.turnOn();
        me.cash = 150.0;
        Human brother = new Human();
        brother.cash = 125.0;
        me.pet.sell(me, brother, 20.0);
        me.car.sell(me, brother, 50.0);
        brother.phone = test;
        brother.phone.sell(brother, me, 5.0);
    }
}
