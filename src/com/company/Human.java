package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalTime;
import java.util.Arrays;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    private static final Integer DEFAULT_GARAGE_SIZE = 2;
    public String phonenumber;
    public Phone phone;
    private Double salary;
    public Double cash;
    public Car[] garage;

    public Double getSalary() {
        System.out.println(LocalTime.now());
        System.out.println(salary);
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0)
            System.out.println("Płaca poniżej 0");
        else {
            System.out.println("Dana wysłane do systemu księgowego");
            System.out.println("Nie zapomnij odebrać aneksu do umowy od pani Hani z kadr");
            System.out.println("Zus i US już wiedzą o zmianie wypłaty");
            this.salary = salary;
        }
    }

    public Human(String firstName, String lastName, String phonenumber, Animal pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phonenumber = phonenumber;
        this.pet = pet;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(String firstName, String lastName, String phonenumber, Animal pet, Integer garageSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phonenumber = phonenumber;
        this.pet = pet;
        this.garage = new Car[garageSize];
    }

    public Car getCar(Integer garageNumber) {
        return garage[garageNumber];
    }

    public void buyCar(Car car) {
        if (getSalary() > car.value) {
            System.out.println("Udało się zakupić samochód");
            this.addCar(car, car.value);
        } else if (getSalary() > (car.value / 12)) {
            System.out.println("Udało się zakupić samochód, ale na kredyt :/ Jest jak jest");
            this.addCar(car, car.value);
        } else
            System.out.println("Nie da rady, trzeba zmienić pracę, wziąć kredyt :( weź się za siebie człowieku a nie memy wrzucasz!");
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar)
                return true;
        }
        return false;
    }

    public Double getGarageValue() {
        Double val = 0.0;
        for (Car car : garage) {
            val += car.value;
        }
        return val;
    }

    public void sortGarage() {
        Arrays.sort(garage);
    }

    public boolean garageHasEmptyPlace() {
        for (Car car : garage) {
            if (car == null)
                return true;
        }
        return false;
    }

    public void removeCar(Car carToRemove) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == carToRemove)
                garage[i] = null;
        }
    }

    public void addCar(Car newCar, Double price) {
        garage[garageFirstEmptyPlace()] = newCar;
        newCar.addTransaction(this, price);
    }

    public void addCar(Car newCar, Human seller, Double price) {
        garage[garageFirstEmptyPlace()] = newCar;
        newCar.addTransaction(this, seller, price);
    }

    public Integer garageFirstEmptyPlace() {
        int index = 0;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                index = i;
                return index;
            }
        }
        return index;
    }

    public void printGarage() {
        for (Car car : garage) {
            System.out.println(car);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", phone='" + phonenumber + '\'' +
                ", salary=" + salary +
                '}';
    }
}
