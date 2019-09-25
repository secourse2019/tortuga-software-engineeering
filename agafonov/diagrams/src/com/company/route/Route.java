package com.company.route;

public class Route {
    private Station[] stations;

    public Route(){}
    public Route(Station[] stations){
        this.setStations(stations);
    }

    public Station[] getStations() {
        return stations;
    }

    public void setStations(Station[] stations) {
        this.stations = stations;
    }


}