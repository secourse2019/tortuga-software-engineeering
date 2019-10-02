package com.company.Transport.dpo.departmant;

import com.company.Transport.dpo.transport.TransportCreator;

import java.util.AbstractList;

public class Garage implements Department {

    private AbstractList<TransportCreator> transportList;

    Garage(AbstractList<TransportCreator> transportList) {
        this.transportList = transportList;
    }

    private void fix() {
        System.out.println("Fixed all problems");
    }

    public AbstractList<TransportCreator> getTransportList() {
        return transportList;
    }

    public void setTransportList(AbstractList<TransportCreator> transportList) {
        this.transportList = transportList;
    }
}
