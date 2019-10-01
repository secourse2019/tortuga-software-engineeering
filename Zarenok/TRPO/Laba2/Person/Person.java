package com.company.Person;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int crazyLevel;

    public Person(){}

    public Person(String name, String surname, int age, int crazyLevel) {
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
        this.setCrazyLevel(crazyLevel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCrazyLevel() {
        return crazyLevel;
    }

    public void setCrazyLevel(int crazyLevel) {
        if(crazyLevel > 10){
            crazyLevel = 10;
        }
        if(crazyLevel < 0){
            crazyLevel = 0;
        }
        this.crazyLevel = crazyLevel;
    }
}

