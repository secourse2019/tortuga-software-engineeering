package com.company.transport;

import com.company.Person.Blogger;
import com.company.Person.Driver;
import com.company.Person.Passanger;
import com.company.Person.Security;
import com.company.Route;

public abstract class UndergroundTransport extends Transport {
    private Security security;

    public UndergroundTransport(){}
    public UndergroundTransport(int number, int amount, int[] timeTable, Route route, Driver driver, Passanger[] passangers, Security security){
        super(number, amount, timeTable, route, driver, passangers);
        this.setSecurity(security);
    }

    @Override
    public abstract void go();

    @Override
    public boolean check(String unit) {
        return unit.toLowerCase() == "token" || unit.toLowerCase() == "card";
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }
}
