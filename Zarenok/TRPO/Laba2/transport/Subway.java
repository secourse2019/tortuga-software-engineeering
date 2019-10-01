package com.company.transport;

import com.company.Person.Driver;
import com.company.Person.Passanger;
import com.company.Person.Security;
import com.company.Route;

import java.util.List;

public class Subway extends UndergroundTransport {
    public Subway(){}
    public Subway(int number, int amount, Route route, Driver driver, List<Passanger> passangers, Security security) {
        super(number, amount, route, driver, passangers, security);
        this.setName("Subway");
    }

    @Override
    public void go() {

    }
}
