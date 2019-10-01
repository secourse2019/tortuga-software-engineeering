package com.company.route;

import java.util.ArrayList;

public class Branches {
    private ArrayList<Station> stations = new ArrayList<Station>();
    public void fillSubwayLine(Station station) {
        this.stations.add(station);
    }
    public Station get(int id) {
        return stations.get(id);
    }
}
