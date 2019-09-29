package com.company.Depo.Transport;

import com.company.Depo.PaymentSystem.PaymentSystem;
import com.company.Depo.Transport.props.Fuel;

import com.company.Depo.Transport.props.Platform;
import com.company.Util.Pair;

public class Transport {
    private Pair<Fuel, Integer> tank;
    private int damage;
    private Platform current;
    private String number;
    private boolean onTheRoad;
    private TransportType type;
    private PaymentSystem pay;

    public Transport(Platform current, String number, Fuel fuel, TransportType type, PaymentSystem pay) {
        this.current = current;
        this.number = number;
        tank = new Pair<Fuel, Integer>(fuel, 0);
        this.type = type;
        this.pay = pay;
    }

    public Transport(Platform road, int i, Fuel oil, int i1, TransportType bus, PaymentSystem cash) {
    }

    public void willSpendOnTheRoad(int distance) {
        if(tank.second < distance / 10) {
            refueling();
        }
    }

    public void refueling() {
        tank.second = 55;
    }
}
