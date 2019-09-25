package com.company.persons;

import com.company.persons.Person;

public class Employee extends Person{
    private int salary;
    public Employee(String name, String surname, int age, int salary){
        super(name, surname, age);
        this.salary = salary;
    }
}