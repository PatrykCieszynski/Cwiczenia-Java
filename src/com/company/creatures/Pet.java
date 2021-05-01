package com.company.creatures;

public class Pet extends Animal {

    public Pet(String species, Double weight, String name) {
        super(species, weight, name);
    }

    public Pet(String species, String name) {
        super(species, name);
    }

    @Override
    public void feed(double foodWeight) {
        if (weight > 0) {
            weight += foodWeight;
            System.out.print("Thx for food, bro. My weight is now " + this.weight + "\n");
        } else
            System.out.print("Your pet died. You monster!\n");
    }
}
