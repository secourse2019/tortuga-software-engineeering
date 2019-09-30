package com.company;

import java.awt.*;

public class Station
{
    private String name;
    private Point position;

    public Station (String name, Point position)
    {
       this.name = name;
       this.position = position;
    }

    public void SetName (String name)
    {
        this.name = name;
    }

    private String GetName ()
    {
        return this.name;
    }

}
