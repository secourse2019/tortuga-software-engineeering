package com.company.transport;

import com.company.persons.Driver;
import com.company.persons.Passanger;
import com.company.route.Branches;
import com.company.timetable.Timetable;

import java.util.ArrayList;

public class Transport implements IUsedTypeOfFuel {
    private int number;
    private Timetable timetable;
    private int fuel = 100;
    private Branches branches;
    private ArrayList<Passanger> passangers;
    private Driver driver;
    private Types TypeOfFuel;

    public Transport(int number, Timetable timetable, int fuel, Branches branches, ArrayList<Passanger> passangers, Driver driver, Types typeOfFuel) {
        setTransportNumber(number);
        setTimetable(timetable);
        setFuel(fuel);
        setPassangers(passangers);
        setDriver(driver);
        this.branches = branches;
    }

    @Override
    public void setUsedTypeOfFuel(Types type) {
        TypeOfFuel = type;
    }

    public Driver getDriver(Driver driver) {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public int[] getTimetable(int[] timetable) {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }

    public int getTransportNumber() {
        return number;
    }

    public void setTransportNumber(int number) {
        this.number = number;
    }

    public void setPassangers (ArrayList<Passanger> passangers) {
        this.passangers = passangers;
    }

    public ArrayList<Passanger> getPassangers () {
        return passangers;
    }
}