package com.company.transport;

import com.company.persons.Driver;
import com.company.persons.Passanger;
import com.company.persons.Security;
import com.company.route.Branches;
import com.company.timetable.Timetable;

import java.util.ArrayList;

public class UndergroundTransport extends Transport {

    private Security security;

    UndergroundTransport(int number, Timetable timetable, int fuel, Branches branch, ArrayList<Passanger> passangers, Driver driver, Security security, Types typeOfFuel) {
        super(number, timetable, fuel, branch, passangers, driver, typeOfFuel);
        setSecurity(security);
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Security getSecurity() {
        return security;
    }
}
