package com.company.transport;

import com.company.persons.Driver;
import com.company.persons.Passanger;
import com.company.persons.Security;
import com.company.route.Branches;
import com.company.timetable.Timetable;

import java.util.ArrayList;

public class Subway extends UndergroundTransport implements IMaxSpeed {

    public int maxSpeed = 60;
    public TurnStiles vasyan;

    Subway(int number, Timetable timetable, int fuel, Branches branch, ArrayList<Passanger> passangers, Driver driver, Security security, Types typeOfFuel, TurnStiles turnStiles) {
        super(number, timetable, fuel, branch, passangers, driver, security, typeOfFuel);
        vasyan = turnStiles;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
