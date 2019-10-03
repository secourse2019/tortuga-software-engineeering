package com.company.Depo.Geolocation;

import com.company.Util.Pair;

public class Geolocation {
    private Pair<Coordinates, Adress> geolocation;

    Geolocation(Coordinates coordinates, Adress adress) {
        this.geolocation.first = coordinates;
        this.geolocation.second = adress;
    }
}
