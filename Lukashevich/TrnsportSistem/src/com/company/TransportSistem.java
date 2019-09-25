package com.company;

public class TransportSistem {

    private Transport[] transports;
    private Department[] departments;
    private double budget;

    public TransportSistem()
    {
        System.out.println("TransportSistem()");
    }

    public void PaySalary()
    {
        System.out.println("paySalary()");
    }

    public void RepairTransport(Transport trnsport)
    {
        System.out.println("RepairTransport()");
    }
}
