package com.company.persons;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int health;

    public Person(){}

    public Person(String name, String surname, int age, int health) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.health = health;
    }

    public void subHealth(int health) {
        this.health -= health;
    }

}