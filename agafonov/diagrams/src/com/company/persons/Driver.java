package com.company.persons;

import com.company.transport.Transport;

public class Driver extends Employee {

    private int fuel;

    Driver(String name, String surname, int age, int health, int salary, int fuel) {
        super(name, surname, age, salary, health);
    }

    public void fillFuel(Transport t, int fuel) {
        t.setFuel(fuel);
        System.out.println("Fuel filled");
    }
}
