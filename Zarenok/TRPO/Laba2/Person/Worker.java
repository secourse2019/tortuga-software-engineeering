package com.company.Person;

public class Worker extends Person {
    private int salary;

    public Worker(){}

    public Worker(String name, String surname, int age, int crazyLevel, int salary) {
        super(name, surname, age, crazyLevel);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
