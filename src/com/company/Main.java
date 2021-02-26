package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", 6.2, "Haiku");
        dog.feed();

        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();

        Phone iPhone = new Phone("Apple", "6S", 4.5, "ios");

        Human me = new Human("Patryk", "Cieszyński", "123456789", dog);

        System.out.println("Zwierzak nazywa się: " + me.pet.name);
    }
}
