package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", "Haiku");
        Animal cat = new Animal("cat", 5.0, "Pan Kot");
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        Human me = new Human("Patryk", "Cieszyński", "123456789", dog);

        System.out.println("Pet name is: " + me.pet.name);
    }
}
