package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.species = "dog";
        dog.name = "Haiku";
        dog.weight = 8.0;
        dog.feed();

        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();

        Phone iPhone = new Phone();
        iPhone.screenSize = 4.5;
        iPhone.producer = "Apple";
        iPhone.model = "6S";
        iPhone.operationSystem = "ios";
    }
}
