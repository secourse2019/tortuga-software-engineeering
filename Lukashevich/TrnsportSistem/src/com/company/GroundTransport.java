package com.company;


public class GroundTransport extends Transport
{
    public Сontroller controller;

    public GroundTransport (Route r, Driver d, int n, Сontroller con)
    {
        super(r, d, n);
        this.controller = con;
    }
}
