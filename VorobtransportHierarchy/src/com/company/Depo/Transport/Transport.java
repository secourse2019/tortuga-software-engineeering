package com.company.Depo.Transport;

import com.company.Depo.PaymentSystem.PaymentSystem;
import com.company.Depo.Transport.props.Fuel;

import com.company.Depo.Transport.props.Platform;

import java.util.Map;

public class Transport {
    private Map<Fuel, Integer> type;
    private int damage;
    private Platform current;
    private String number;
    private boolean onTheRoad;
    private TransportType type;
    private PaymentSystem pay;

    public Transport(Platform current, String number, Fuel fuel, TransportType type, PaymentSystem pay) {
        this.current = current;
        this.number = number;
        this.type.put(fuel,  0);
        this.pay = pay;
    }

    public Transport(Platform road, int i, Fuel oil, int i1, TransportType bus, PaymentSystem cash) {
    }

    public void willSpendOnTheRoad(int distance, boolean nec) {
        if(necessity(nec) && type.get(1).volume < distance / 10) {
            refueling();
        }
    }

    boolean necessity(boolean nec) {
        return nec;
    }

    public void refueling() {
        type.get(1).volume = 55;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PaymentSystem getPay() {
        return pay;
    }
}
