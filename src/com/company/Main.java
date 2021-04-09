package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", "Haiku");
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
        Human me = new Human("Patryk", "Cieszyński", "123456789", dog);

        me.getSalary();
        me.setSalary(3000);
        me.getSalary();

        System.out.println(me.getCar());
        me.setCar(fiat);
        System.out.println(me.getCar());
    }
}
