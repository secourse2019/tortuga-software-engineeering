package com.company.transport;


import com.company.Person.Driver;
import com.company.Person.Passanger;
import com.company.Route;

public abstract class Transport implements Payments {
    private int number;
    private int stock = 100;
    private int amount;
    private int[] timeTable;
    private Route route;
    private Driver driver;
    private Passanger[] passangers;

    public Transport(){}

    public Transport(int number, int amount, int[] timeTable, Route route, Driver driver, Passanger[] passangers){
        this.setNumber(number);
        this.setAmount(amount);
        this.setTimeTable(timeTable);
        this.setRoute(route);
        this.setDriver(driver);
        this.setPassangers(passangers);
    }

    @Override
    public abstract boolean check(String unit);

    public abstract void go();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int[] getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(int[] timeTable) {
        this.timeTable = timeTable;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Passanger[] getPassangers() {
        return passangers;
    }

    public void setPassangers(Passanger[] passangers) {
        this.passangers = passangers;
    }
}
