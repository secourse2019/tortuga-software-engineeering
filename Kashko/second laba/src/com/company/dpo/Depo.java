package com.company.dpo;

import com.company.dpo.departmant.Garage;
import com.company.dpo.departmant.OfficeDepartment;
import com.company.dpo.employer.Employer;

import java.util.ArrayList;

public class Depo {
    public ArrayList<Employer> employerList;
    public String stationName;
    public OfficeDepartment officeDepartment;
    public Garage garage;

    Depo(ArrayList<Employer> employerList, String stationName, OfficeDepartment officeDepartment, Garage garage) {
        this.employerList = employerList;
        this.stationName = stationName;
        this.officeDepartment = officeDepartment;
        this.garage = garage;
    }
}
