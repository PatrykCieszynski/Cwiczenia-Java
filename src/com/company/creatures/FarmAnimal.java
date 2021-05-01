package com.company.creatures;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species, Double weight, String name) {
        super(species, weight, name);
    }

    public FarmAnimal(String species, String name) {
        super(species, name);
    }

    @Override
    public void beEaten() {

    }

    @Override
    public void feed(Double foodWeight) {
        if (weight > 0) {
            weight += foodWeight;
            System.out.print("Animal weight is now " + this.weight + "\n");
        } else
            System.out.print("This animal died.\n");
    }
}
