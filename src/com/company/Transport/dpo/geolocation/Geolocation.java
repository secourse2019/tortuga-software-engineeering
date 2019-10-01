package com.company.Transport.dpo.geolocation;

import java.util.Map;

public class Geolocation {

    private Map<Coordinates, Address> geolocation;

    Geolocation(Coordinates coordinates, Address adress) {
        this.geolocation.put(coordinates, adress);
    }
}
