package com.company.Depo;

import com.company.Depo.Department.OfficeDepartment;
import com.company.Depo.Employer.Employer;
import com.company.Depo.Transport.props.Garage;

import java.util.ArrayList;

public class Depo {
    private static final Garage transportArrayList;

    static {
        transportArrayList = new Garage(11);
    }

    private ArrayList employerList = new ArrayList();
    private String stationName;
    private OfficeDepartment officeDepartment;
    private Garage garage;

    /**
     */
    Depo() {
        this("Serebrjanka's Depo",77 , transportArrayList);
    }

    /**
     * @param stationName
     * @param officeDepartment
     * @param garage
     */
    Depo(String stationName, OfficeDepartment officeDepartment, Garage garage) {
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
