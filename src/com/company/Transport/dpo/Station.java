package com.company.Transport.dpo;

import com.company.Transport.dpo.mans.Passenger;

import java.util.ArrayList;

public class Station {
    public ArrayList<Passenger> awaiting;
    private String name;
    private String timetable;

    Station(String name, String timetable) {
        this.name = name;
        this.timetable = timetable;
    }

    public String getTimetable() {
        return timetable;
    }

    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
