package com.company.transport;

import com.company.persons.Controllers;
import com.company.persons.Driver;
import com.company.persons.Passanger;
import com.company.route.Route;

public class Tram extends GroundTransport implements IMaxSpeed {
    private int maxSpeed = 60;
    private Validator validator;

    Tram(int number, int[] timetable, int fuel, Route route, Passanger[] passangers, Driver driver, Controllers controller, Types typeOfFuel, Validator validator){
        super(number, timetable, fuel, route, passangers, driver, controller, typeOfFuel);
        this.validator = validator;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
