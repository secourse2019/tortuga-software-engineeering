package com.company.transport;

import com.company.route.Route;
import com.company.persons.Driver;
import com.company.persons.Passanger;
import com.company.persons.Security;

public class UndergroundTransport extends Transport {

    private Security security;

    UndergroundTransport(int number, int[] timetable, int fuel, Route route, Passanger[] passangers, Driver driver, Security security, Types typeOfFuel){
        super(number, timetable, fuel, route, passangers, driver, typeOfFuel);
        setSecurity(security);
    }

    public void setSecurity(Security security){
        this.security = security;
    }

    public Security getSecurity(){
        return security;
    }
}
