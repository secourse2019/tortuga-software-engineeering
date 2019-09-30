package com.company.Transport.dpo.departmant;

import com.company.Transport.dpo.transport.TransportCreator;
import java.util.ArrayList;

public class Garage implements Department {

    private ArrayList<TransportCreator> transportList;

    Garage(ArrayList<TransportCreator> transportList) {
        this.transportList = transportList;
    }

    private void Fix() {
        System.out.println("Fixed all problems");
    }

    public ArrayList<TransportCreator> getTransportList() {
        return transportList;
    }

    public void setTransportList(ArrayList<TransportCreator> transportList) {
        this.transportList = transportList;
    }
}
