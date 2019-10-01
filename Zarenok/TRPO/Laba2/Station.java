package com.company;

import com.company.Person.Passanger;
import java.util.ArrayList;


public class Station {
    private String name;
    private Point coordinates;
    private ArrayList<Passanger> passangers;

    public Station(){}

    public Station(String name, Point coordinates, ArrayList<Passanger> passangers) {
        this.setName(name);
        this.setCoordinates(coordinates);
        this.setPassangers(passangers);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public ArrayList<Passanger> getPassangers() {
        return passangers;
    }

    public void setPassangers(ArrayList<Passanger> passangers) {
        this.passangers = passangers;
    }
}
