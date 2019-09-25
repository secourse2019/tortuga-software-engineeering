package com.company;

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

    private double getDistanceBetweenTwoStation(Station a, Station b){
        return Math.sqrt(Math.pow(a.getCoordinates().getX() - b.getCoordinates().getX(), 2) + Math.pow(a.getCoordinates().getY() - b.getCoordinates().getY(), 2));
    }

    public double stage(){
        double result = 0;
        for(int i = 0; i != this.stations.length; ++i){
            result += getDistanceBetweenTwoStation(this.stations[i+1], this.stations[i]);
        }
        return result;
    }
}
