package com.company.Transport.dpo.transport;

import com.company.Transport.PaymentSystem;
import com.company.Transport.dpo.Station;
import com.company.Transport.dpo.mans.Passenger;
import com.company.Transport.util.Pair;
import com.company.Transport.util.Util;

import java.util.ArrayList;

public class TransportCreator implements Transport {

    private int damage;
    private Platform movementMethod;
    private String number;
    public ArrayList<Passenger> passengers;
    private Pair<Fuel, Integer> type;
    private PaymentSystem pay;

    TransportCreator(Platform movementMethod, String number, String fuel, TransportType type, PaymentSystem pay) {
        this.movementMethod = movementMethod;
        this.number = number;
        this.type.first.type = fuel;
        this.pay = pay;
    }

    @Override
    public void WillSpendOnTheRoad(int distance, boolean nec) {
        if(Necessity(nec) && type.second < distance / 10) {
            Refueling();
        }
    }

    @Override
    public void Refueling() {
        type.second = 55;
    }

    @Override
    public boolean Necessity(boolean nec) {
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

    public void GoOutOf(Station station, int index) {
        Util.Move(passengers, station.awaiting, index);
    }

    public void Fill(Station station, int index) {
        Util.Move(station.awaiting, passengers, index);
    }
}
