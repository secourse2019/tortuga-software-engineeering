package com.company.transport;

import com.company.Person.Blogger;
import com.company.Person.Driver;
import com.company.Person.Passanger;
import com.company.Route;

public class Tram extends GroundTransport {
    public Tram(){}
    public Tram(int number, int amount, int[] timeTable, Route route, Driver driver, Passanger[] passangers, Blogger blogger){
        super(number, amount, timeTable, route, driver, passangers, blogger);
    }

    @Override
    public void go() {
        System.out.println("Tram Work");
    }
}
