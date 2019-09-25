package com.company.transport;

import com.company.persons.Driver;
import com.company.persons.Passanger;
import com.company.persons.Security;
import com.company.route.Route;

public class Subway extends UndergroundTransport implements IMaxSpeed {

    public int maxSpeed = 60;
    public TurnStiles vasyan;

    Subway(int number, int[] timetable, int fuel, Route route, Passanger[] passangers, Driver driver, Security security, Types typeOfFuel, TurnStiles turnStiles){
        super(number, timetable, fuel, route, passangers, driver, security, typeOfFuel);
        vasyan = turnStiles;
    }

    @Override
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
}
