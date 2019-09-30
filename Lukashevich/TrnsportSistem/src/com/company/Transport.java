package com.company;

import java.util.ArrayList;

public class Transport
{
    private static int count = 0;
    public int id;
    private Route route;
    private Driver driver;
    public int nomber;
    public ArrayList<Passager> passagers = new ArrayList<Passager>();

    public Transport(Route r, Driver d, int n)
    {
        this.driver = d;
        this.nomber = n;
        this.route = r;
        count++;
        this.id = count;
    }

    public void ChangeDriver (Driver d)
    {
        this.driver = d;
    }

    public void AddPasader (Passager p)
    {
        passagers.add(p);
        p.Pay(this.id);
    }

    private int FindPassaagerByID (int id)
    {
        for (int i = 0; i < this.passagers.size(); i++) {

            if (this.passagers.get(i).GetCard().GetID() == id){
                return i;
            }
        }
        return -1;
    }

    public void PassagerMooveTransport (int id)
    {
        this.passagers.remove(FindPassaagerByID(id));
    }
}
