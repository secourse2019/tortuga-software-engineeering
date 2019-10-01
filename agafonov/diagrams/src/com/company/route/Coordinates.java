package com.company.route;

import java.util.HashMap;

public class Coordinates extends HashMap <Station, Coordinates> {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}