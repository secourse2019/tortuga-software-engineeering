package com.company.transport;

import com.company.Person.Blogger;
import com.company.Person.Driver;
import com.company.Person.Passanger;
import com.company.Route;

import java.util.List;

public class Tram extends GroundTransport {
    public Tram(){}
    public Tram(int number, int amount, Route route, Driver driver, List<Passanger> passangers, Blogger blogger){
        super(number, amount, route, driver, passangers, blogger);
        this.setName("Tram");
    }

    @Override
    public void go() {
        System.out.println("Tram Work");
    }
}
