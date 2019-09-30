package com.company;

import java.util.ArrayList;

public class Route {
    private ArrayList<Station> stations;

    public Route(){}
    public Route(ArrayList<Station> stations){
        this.setStations(stations);
    }

    public ArrayList<Station> getStations() {
        return stations;
    }

    public Station getStation(int index) {
      return this.stations.get(index);
    };

    public void setStations(ArrayList<Station> stations) {
        this.stations = stations;
    }

    private double getDistanceBetweenTwoStation(Station a, Station b){
        return Math.sqrt(Math.pow(a.getCoordinates().getX() - b.getCoordinates().getX(), 2) + Math.pow(a.getCoordinates().getY() - b.getCoordinates().getY(), 2));
    }

    public double stage(){
        double result = 0;
        for(int i = 0; i != this.stations.size(); ++i){
            result += getDistanceBetweenTwoStation(this.stations.get(i+1), this.stations.get(i));
        }
        return result;
    }
}
