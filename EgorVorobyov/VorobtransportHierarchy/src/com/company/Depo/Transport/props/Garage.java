package com.company.Depo.Transport.props;

import com.company.Depo.Transport.Transport;

import java.util.List;

public class Garage {
    private List<Transport> transportList;

    public Garage(List<Transport> transportList) {
        this.transportList = transportList;
    }

    public List<Transport> getTransportList() {
        return transportList;
    }

    public void setTransportList(List<Transport> transportList) {
        this.transportList = transportList;
    }
}
