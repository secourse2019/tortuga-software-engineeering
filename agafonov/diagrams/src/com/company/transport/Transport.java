package com.company.transport;

import com.company.route.Route;
import com.company.persons.Driver;
import com.company.persons.Passanger;

public class Transport implements UsedTypeOfFuel{
    private int number;
    private int[] timetable;
    private int fuel = 100;
    private Route route;
    private Passanger[] passangers;
    private Driver driver;
    private Types TypeOfFuel;

    public Transport(int number, int[] timetable, int fuel, Route route, Passanger[] passangers, Driver driver, Types typeOfFuel){
        setTransportNumber(number);
        setTimetable(timetable);
        setFuel(fuel);
        setPassangers(passangers);
        setDriver(driver);
        this.route = route;
    }

    @Override
    public void setUsedTypeOfFuel(Types type){
        TypeOfFuel = type;
    }

    public Driver getDriver(Driver driver){
        return driver;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public int[] getTimetable(int[] timetable){
        return timetable;
    }

    public void setTimetable(int[] timetable){
        this.timetable = timetable;
    }

    public int getTransportNumber(){
        return number;
    }

    public void setTransportNumber(int number){
        this.number = number;
    }

    public void setPassangers (Passanger[] passangers){
        this.passangers = passangers;
    }

    public Passanger[] getPassangers (){
        return passangers;
    }
}