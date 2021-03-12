package com.company;

import java.io.File;

public class Animal {
    final public String species;
    public String name;
    public File pic;
    private Double weight;
    private static final Double DEFAULT_FOOD_WEIGHT = 0.2;
    private final static Double DEFAULT_ANIMAL_WEIGHT = 2.0;
    private final static Double DEFAULT_CAT_WEIGHT = 3.0;
    private final static Double DEFAULT_DOG_WEIGHT = 4.0;
    private final static Double DEFAULT_COW_WEIGHT = 250.0;

    public Animal(String species, Double weight, String name) {
        this.species = species;
        this.weight = weight;
        this.name = name;
    }

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
        switch (this.species) {
            case "dog" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "cat" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "cow" -> this.weight = DEFAULT_COW_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    void feed() {
        if (weight > 0) {
            weight += DEFAULT_FOOD_WEIGHT;
            System.out.print("Thx for food, bro. My weight is now " + this.weight + "\n");
        } else
            System.out.print("Your pet died. You monster!\n");
    }

    void takeForAWalk() {
        if (weight > 0) {
            weight -= DEFAULT_FOOD_WEIGHT;
            System.out.print("Thx for walk. My weight is now " + this.weight + "\n");
        } else
            System.out.print("Your pet died. You monster!\n");
    }
}
