package com.company.transport;

import com.company.route.Route;
import com.company.persons.Driver;
import com.company.persons.Passanger;
import com.company.persons.Controllers;

public class GroundTransport extends Transport{

    private Controllers controller;

    GroundTransport(int number, int[] timetable, int fuel, Route route, Passanger[] passangers, Driver driver, Controllers controller, Types typeOfFuel){
        super(number, timetable, fuel, route, passangers, driver, typeOfFuel);
        setController(controller);
    }

    public void setController(Controllers controller){
        this.controller = controller;
    }
}
