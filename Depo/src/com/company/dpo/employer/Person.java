package com.company.dpo.employer;

public class Person {

    public int age;
    public String name;
    public String surname;

    public void getName() {
        System.out.println(name);
    }

    public void getSurname() {
        System.out.println(surname);
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }
}
