package com.company.Transport.dpo;

import com.company.Transport.dpo.departmant.Garage;
import com.company.Transport.dpo.departmant.OfficeDepartment;
import com.company.Transport.dpo.mans.Employer;

import java.util.ArrayList;

public class Depo {
    private ArrayList<Employer> employerList;
    private String stationName;
    private OfficeDepartment officeDepartment;
    private Garage garage;

    Depo(ArrayList<Employer> employerList, String stationName, OfficeDepartment officeDepartment, Garage garage) {
        this.setEmployerList(employerList);
        this.setStationName(stationName);
        this.setOfficeDepartment(officeDepartment);
        this.setGarage(garage);
    }

    public ArrayList<Employer> getEmployerList() {
        return employerList;
    }

    public void setEmployerList(ArrayList<Employer> employerList) {
        this.employerList = employerList;
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
}
