package com.company.Person;

import com.company.transport.Transport;

public class Driver extends Worker {
    public Driver(){}
    public Driver(String name, String surname, int age, int salary){
        super(name, surname, age, salary);
    }

    public void drive(Transport transport){
        transport.go();
    }

}
