package com.company.persons;

import com.company.persons.Person;

public class Employee extends Person {
    private int salary;
    public Employee(String name, String surname, int age, int salary, int health) {
        super(name, surname, age, health);
        this.salary = salary;
    }
}