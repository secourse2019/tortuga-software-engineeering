package com.company.transport;

import com.company.persons.Driver;
import com.company.persons.Passanger;
import com.company.persons.Controller;
import com.company.route.Branches;
import com.company.timetable.Timetable;

import java.util.ArrayList;

public class GroundTransport extends Transport {

    private Controller controller;

    GroundTransport(int number, Timetable timetable, int fuel, Branches branches, ArrayList<Passanger> passangers, Driver driver, Controller controller, Types typeOfFuel) {
        super(number, timetable, fuel, branches, passangers, driver, typeOfFuel);
        setController(controller);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
