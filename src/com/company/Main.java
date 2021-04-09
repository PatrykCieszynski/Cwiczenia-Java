package com.company;

import com.company.device.Car;
import com.company.device.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", "Haiku");
        Phone test = new Phone("Nokia", "3310", 5.0, "Android");
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
        Car fiat = new Car("126p", "Fiat", "red", 2500.0);
        Car polonez = new Car("126p", "Fiat", "red", 2500.0);
        Human me = new Human("Patryk", "Cieszyński", "123456789", dog);

        me.getSalary();
        me.setSalary(3000);
        me.getSalary();

        System.out.println(me.getCar());
        me.setCar(fiat);
        System.out.println(me.getCar());

        System.out.println(new Car("126p", "Fiat", "blue", 2500.0).equals(new Car("126p", "Fiat", "blue", 2500.0)));
        System.out.println(polonez.equals(fiat));
        System.out.println(polonez);
        System.out.println(me);
        System.out.println(dog);
        System.out.println(test);

    }
}
