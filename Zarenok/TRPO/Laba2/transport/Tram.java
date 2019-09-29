package com.company.transport;

import com.company.Person.Blogger;
import com.company.Person.Driver;
import com.company.Person.Passanger;
import com.company.Route;

import java.util.ArrayList;

public class Tram extends GroundTransport {
    public Tram(){}
    public Tram(int number, int amount, int[] timeTable, Route route, Driver driver, ArrayList<Passanger> passangers, Blogger blogger){
        super(number, amount, timeTable, route, driver, passangers, blogger);
        this.setName("Tram");
    }

    @Override
    public void go() {
        System.out.println("Tram Work");
    }
}
