package com.company;

public class Station {
    private String name;
    private Point coordinates;

    public Station(){}

    public Station(String name, Point coordinates){
        this.setName(name);
        this.setCoordinates(coordinates);
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
}
