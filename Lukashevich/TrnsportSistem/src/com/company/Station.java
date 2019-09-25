package com.company;

import java.awt.*;

public class Station
{
    private String name;
    private Point position;

    public Station ()
    {
        System.out.println("Station ()");
    }

    public void SetName (String name)
    {
        System.out.println("SetName (String name)");
    }

    private String GetName ()
    {
        System.out.println("GetName ()");
        return this.name;
    }

}
