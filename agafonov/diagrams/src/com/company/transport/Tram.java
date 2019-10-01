package com.company.transport;

import com.company.persons.Controller;
import com.company.persons.Driver;
import com.company.persons.Passanger;
import com.company.route.Branches;
import com.company.timetable.Timetable;

import java.util.ArrayList;

public class Tram extends GroundTransport implements IMaxSpeed {
    private int maxSpeed = 60;
    private Validator validator;

    Tram(int number, Timetable timetable, int fuel, Branches branches, ArrayList<Passanger> passangers, Driver driver, Controller controller, Types typeOfFuel, Validator validator) {
        super(number, timetable, fuel, branches, passangers, driver, controller, typeOfFuel);
        this.validator = validator;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
