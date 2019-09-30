package com.company;

public class FuelTransport extends RoadTransport
{
    public int fuilValue;
    public int maxFuel;

    public FuelTransport (int fuel, Route r, Driver d, int n, Сontroller con)
    {
        super(r, d, n, con);
        this.fuilValue = fuel;
        this.maxFuel = fuel;
    }

    public void GetFuel ()
    {
        this.fuilValue = this.maxFuel;
    }
}
