package com.company.persons;

public class Security extends Employee {

    private Dubinka marusya;

    Security(String name, String surname, int age, int salary, Dubinka dubinka) {
        super(name, surname, age, salary);
        marusya = dubinka;
    }

}
