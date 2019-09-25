package com.company.dpo.transport;

import com.company.PaymentSystem;
import com.company.util.Pair;

import java.lang.management.ThreadInfo;

public class TransportCreator implements Transport {

    private int damage;
    private Platform movementMethod;
    private String number;
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
}
