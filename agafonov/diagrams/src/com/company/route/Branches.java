package com.company.route;

import java.util.HashMap;

public class Branches {
    private HashMap<Station,Coordinates> stations = new HashMap<Station,Coordinates>();
    public void fillSubwayLine(Station station, Coordinates coordinates) {
        this.stations.put(station, coordinates);
    }
    public HashMap<Station,Coordinates> get(int id) {
        return stations.get(id);
    }
}
