package com.company.Depo;

import com.company.Depo.Department.OfficeDepartment;
import com.company.Depo.Employer.Employer;
import com.company.Depo.Transport.Transport;
import com.company.Depo.Transport.props.Garage;

import java.util.*;

public class Depo {
    private List employerList;
    private String stationName;
    private OfficeDepartment officeDepartment;
    private Garage garage;

    /**
     * @param stationName
     * @param officeDepartment
     * @param garage
     */
    Depo(String stationName, OfficeDepartment officeDepartment, Garage garage) {
        this.setStationName(stationName);
        this.setOfficeDepartment(officeDepartment);
        this.setGarage(garage);
        this.employerList = employerList;
    }

    public ArrayList<Employer> getEmployerList() {
        return employerList;
    }

    public void setEmployerList(List<Employer> employerList) {
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
