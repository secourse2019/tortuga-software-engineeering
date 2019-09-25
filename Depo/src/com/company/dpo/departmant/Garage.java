package com.company.dpo.departmant;

import com.company.dpo.transport.TransportCreator;

import java.util.ArrayList;

public class Garage implements Department {

    private ArrayList<TransportCreator> transportList;

    Garage(ArrayList<TransportCreator> transportList) {
        this.transportList = transportList;
    }

    private  void Fix() {
        System.out.println("Fixed all problems");
    }
}
