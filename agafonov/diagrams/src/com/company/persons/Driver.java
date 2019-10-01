package com.company.persons;

import com.company.transport.Transport;

public class Driver extends Employee {

    private Transport currentTransport;

    Driver(String name, String surname, int age, int health, int salary, int fuel, Transport currentTransport) {
        super(name, surname, age, salary, health);
        this.currentTransport = currentTransport;
    }

    public void fillFuel(int count) {
        this.currentTransport.fillFuel(count);
    }
}
