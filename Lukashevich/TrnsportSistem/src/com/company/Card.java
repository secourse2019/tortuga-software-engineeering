package com.company;

public class Card
{
    private static int coutID = 0;
    private int id;
    public int lastPayTransportId;

    public Card()
    {
        coutID++;
        this.id = coutID;
    }

    public int GetID ()
    {
        return this.id;
    }

}
