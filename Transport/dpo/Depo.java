package com.company.Transport.dpo;

import com.company.Transport.dpo.departmant.Garage;
import com.company.Transport.dpo.departmant.OfficeDepartment;
import com.company.Transport.dpo.geolocation.Geolocation;
import com.company.Transport.dpo.mans.Employer;

import java.util.AbstractList;

public class Depo {
    public AbstractList<Employer> employerList;
    private String stationName;
    private OfficeDepartment officeDepartment;
    private Garage garage;
    private Geolocation geolocation;

    Depo(String stationName, OfficeDepartment officeDepartment, Garage garage, Geolocation geolocation) {
        this.setStationName(stationName);
        this.setOfficeDepartment(officeDepartment);
        this.setGarage(garage);
        this.setGeolocation(geolocation);
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public OfficeDepartment getOfficeDepartment() {
        return officeDepartment;
    }

    public void setOfficeDepartment(OfficeDepartment officeDepartment) {
        this.officeDepartment = officeDepartment;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(Geolocation geolocation) { this.geolocation = this.geolocation; }
}
