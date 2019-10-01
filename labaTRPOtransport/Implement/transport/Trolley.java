package com.company.transport;

import com.company.Person.Blogger;
import com.company.Person.Driver;
import com.company.Person.Passanger;
import com.company.Route;

import java.util.ArrayList;

public class Trolley extends GroundTransport {
    public Trolley(){}
    public Trolley(int number, int amount, int[] timeTable, Route route, Driver driver, ArrayList<Passanger> passangers, Blogger blogger){
        super(number, amount, timeTable, route, driver, passangers, blogger);
        this.setName("Trolley");
    }

    @Override
    public void go() {
        System.out.println("Trolley Work");
    }
}
