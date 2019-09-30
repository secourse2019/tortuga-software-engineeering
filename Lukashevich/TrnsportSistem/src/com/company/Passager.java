package com.company;

public class Passager
{
    private String name;
    private String surname;
    private Card card;

    public Passager (String name, String surname)
    {
        System.out.println("Passager (String name, String surname)");
    }

    public void Pay (int transportId)
    {
        this.card.lastPayTransportId = transportId;
    }

    public Card GetCard ()
    {
        return this.card;
    }
}
