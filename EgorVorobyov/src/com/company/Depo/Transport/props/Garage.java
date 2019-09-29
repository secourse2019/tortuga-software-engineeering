package com.company.Depo.Transport.props;

import com.company.Depo.Transport.Transport;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Transport> transportArrayList;

    public Garage(ArrayList<Transport> transportArrayList) {
        this.transportArrayList = transportArrayList;
    }

    public Garage(int i) {

    }

    public ArrayList<Transport> getTransportArrayList() {
        return transportArrayList;
    }

    public void setTransportArrayList(ArrayList<Transport> transportArrayList) {
        this.transportArrayList = transportArrayList;
    }
}
