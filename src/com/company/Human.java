package com.company;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car car;
    protected String phone;

    public Human(String firstName, String lastName, String phone, Animal pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
    }
}
