package com.company.route;

import java.util.ArrayList;

public class Station {
    private String name;
    private Coordinates coordinates;
    private int id;

    public Station(int id, String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;
        this.id = id;
    };
}