package com.company;

import com.company.Depo.PaymentSystem.PaymentSystem;
import com.company.Depo.Transport.Transport;
import com.company.Depo.Transport.TransportType;
import com.company.Depo.Transport.props.Fuel;
import com.company.Depo.Transport.props.Platform;

public class Main {

    public static void main(String[] args) {
        Fuel oil = new Fuel();
        Transport bus = new Transport(Platform.Road, 36, oil, 55, TransportType.Bus, PaymentSystem.Cash);
        System.out.println();
        bus.refueling();
        //bus.willSpendOnTheRoad(100);
    }
}
