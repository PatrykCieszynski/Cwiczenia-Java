package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalTime;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car car;
    public String phonenumber;
    public Phone phone;
    private Double salary;
    public Double cash;

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
    }

    public Human() {

    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (getSalary() > car.value) {
            System.out.println("Udało się zakupić samochód");
            this.car = car;
        } else if (getSalary() > (car.value / 12)) {
            System.out.println("Udało się zakupić samochód, ale na kredyt :/ Jest jak jest");
            this.car = car;
        } else
            System.out.println("Nie da rady, trzeba zmienić pracę, wziąć kredyt :( weź się za siebie człowieku a nie memy wrzucasz!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                ", phone='" + phonenumber + '\'' +
                ", salary=" + salary +
                '}';
    }
}
