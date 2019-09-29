package com.company.transport;

import com.company.Person.Blogger;
import com.company.Person.Driver;
import com.company.Person.Passanger;
import com.company.Route;

import java.util.ArrayList;

public class Bus extends GroundTransport {
    public Bus(int number, int amount, int[] timeTable, Route route, Driver driver, ArrayList<Passanger> passangers, Blogger blogger){
        super(number, amount, timeTable, route, driver, passangers, blogger);
    }

    @Override
    public void go() {
        int prevStock = this.getStock();
        if(prevStock < 20){
            System.out.println("U need to fill fuel");
        }
        System.out.println("Bus Work");
        this.setStock(prevStock - 20);
    }

    public void fillFuel(){
        this.setStock(100);
    }
}
