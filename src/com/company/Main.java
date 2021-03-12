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
        Human me = new Human("Patryk", "Cieszyński", "123456789", dog);

        me.car = new Car("126p", "Fiat", "red");
        System.out.println(me.car.model);
    }
}
