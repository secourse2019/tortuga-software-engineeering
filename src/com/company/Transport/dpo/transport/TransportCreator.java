package com.company.Transport.dpo.transport;

import com.company.Transport.PaymentSystem;
import com.company.Transport.dpo.Station;
import com.company.Transport.dpo.mans.Passenger;
import com.company.Transport.util.Util;
import java.util.AbstractList;
import java.util.Map;

public class TransportCreator implements Transport {

    private int damage;
    private Platform movementMethod;
    private String number;
    private AbstractList<Passenger> passengers;
    private Map<Integer, Fuel> type;
    private PaymentSystem pay;

    TransportCreator(Platform movementMethod, String number, Fuel fuel, TransportType type, PaymentSystem pay) {
        this.movementMethod = movementMethod;
        this.number = number;
        this.type.put(0, fuel);
        this.pay = pay;
    }

    @Override
    public void willSpendOnTheRoad(int distance, boolean nec) {
        if(necessity(nec) && type.get(0).volume < distance / 10) {
            refueling();
        }
    }

    @Override
    public void refueling() {
        type.get(0).volume = 55;
    }

    @Override
    public boolean necessity(boolean nec) {
        return nec;
    }

    @Override
    public Platform getMovementMethod() { return movementMethod; }

    @Override
    public void setMovementMethod(Platform movementMethod) {
        this.movementMethod = movementMethod;
    }

    @Override
    public String getNumber() { return number; }

    @Override
    public void setNumber(String number) { this.number = number; }

    @Override
    public PaymentSystem getPay() { return pay; }

    @Override
    public void setPay(PaymentSystem pay) { this.pay = pay; }

    public void goOutOf(Station station, int index) { Util.move(passengers, station.awaiting, index); }

    public void Fill(Station station, int index) {
        Util.move(station.awaiting, passengers, index);
    }
}
