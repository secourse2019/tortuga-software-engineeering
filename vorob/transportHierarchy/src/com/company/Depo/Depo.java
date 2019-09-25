package com.company.Depo;

import com.company.Depo.Department.Department;
import com.company.Depo.Department.OfficeDepartment;
import com.company.Depo.Employer.Employer;
import com.company.Depo.Transport.props.Garage;

import java.util.List;

public class Depo {
    List<Employer> employerList;
    String stationName;
    public OfficeDepartment officeDepartment;
    public Garage garage;

    Depo(List<Employer> employerList, String stationName, OfficeDepartment officeDepartment, Garage garage) {
        this.employerList = employerList;
        this.stationName = stationName;
        this.officeDepartment = officeDepartment;
        this.garage = garage;
    }
}
