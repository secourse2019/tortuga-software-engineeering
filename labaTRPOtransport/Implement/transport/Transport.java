package com.company.transport;


import com.company.Person.Driver;
import com.company.Person.Passanger;
import com.company.Route;
import com.company.Station;

import javax.net.ssl.HandshakeCompletedEvent;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Transport implements Payments {
    private String name;
    private int number;
    private int stock = 100;
    private int amount;
    private Route route;
    private Driver driver;
    private ArrayList<Passanger> passangers;

    public Transport(){}

    public Transport(String name, int number, int amount, Route route, Driver driver, ArrayList<Passanger> passangers){
        this.setName(name);
        this.setNumber(number);
        this.setAmount(amount);
        this.setRoute(route);
        this.setDriver(driver);
        this.setPassangers(passangers);
    }


   /* public void stop(Station stop) { // TEST FUNCTION FOR ADDING AND DELETING PESSANGERS IN SPACE
        ArrayList<Passanger> PassInTr = this.getPassangers();
        ArrayList<Passanger> PassOnSt = stop.getPassangers();
        HashMap<String, Integer> needTr = new HashMap<String, Integer>();
        for (int i = 0; i < PassOnSt.size(); i++) {
            if(PassInTr.get(i).getOutStation().equals(stop.getName())) {
                PassOnSt.add(PassInTr.get(i));
                PassInTr.remove(i);
            }
            needTr.put(PassOnSt.get(i).getTransport().getName(), PassOnSt.get(i).getTransport().getNumber());
            for(HashMap.Entry<String, Integer> item : needTr.entrySet()) {
                if(item.getKey() == this.getName() && item.getValue() == this.getNumber()){
                    PassOnSt.get(i).setInTransport(true);
                    PassInTr.add(PassOnSt.get(i));
                }
                else {
                    PassOnSt.get(i).setInTransport(false);
                }
            }
        }
    }*/

    @Override
    public abstract boolean check(String unit);

    public abstract void go();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public ArrayList<Passanger> getPassangers() {
        return passangers;
    }

    public void setPassangers(ArrayList<Passanger> passangers) {
        this.passangers = passangers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
