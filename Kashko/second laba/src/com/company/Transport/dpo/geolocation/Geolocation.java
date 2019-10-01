package com.company.Transport.dpo.geolocation;

import com.company.Transport.util.Pair;

public class Geolocation {

    private Pair<Coordinates, Adress> geolocation;

    Geolocation(Coordinates coordinates, Adress adress) {
        this.geolocation.first = coordinates;
        this.geolocation.second = adress;
    }
}
