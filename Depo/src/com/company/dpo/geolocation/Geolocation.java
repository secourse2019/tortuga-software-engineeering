package com.company.dpo.geolocation;

import com.company.util.Pair;

public class Geolocation {

    private Pair<Coordinates, Adress> geolocation;

    Geolocation(Coordinates coordinates, Adress adress) {
        this.geolocation.first = coordinates;
        this.geolocation.second = adress;
    }
}
