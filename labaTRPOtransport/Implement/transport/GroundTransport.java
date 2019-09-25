package com.company.transport;

import com.company.Person.Blogger;
import com.company.Person.Driver;
import com.company.Person.Passanger;
import com.company.Route;

public abstract class GroundTransport extends Transport {
    Blogger blogger;

    public GroundTransport(){}
    public GroundTransport(int number, int amount, int[] timeTable, Route route, Driver driver, Passanger[] passangers, Blogger blogger){
        super(number, amount, timeTable, route, driver, passangers);
        this.blogger = blogger;
    }

    @Override
    public boolean check(String unit) {
        return unit.toLowerCase() == "card" || unit.toLowerCase() == "ticket";
    }

    @Override
    public abstract void go();
}
