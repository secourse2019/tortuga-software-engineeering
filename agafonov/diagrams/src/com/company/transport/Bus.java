package com.company.transport;

import com.company.route.Route;
import com.company.persons.Controllers;
import com.company.persons.Driver;
import com.company.persons.Passanger;

public class Bus extends GroundTransport implements IMaxSpeed {

    private int maxSpeed = 80;
    private Validator validator;

    Bus(int number, int[] timetable, int fuel, Route route, Passanger[] passangers, Driver driver, Controllers controller, Types typeOfFuel, Validator validator){
        super(number, timetable, fuel, route, passangers, driver, controller, typeOfFuel);
        this.validator = validator;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
