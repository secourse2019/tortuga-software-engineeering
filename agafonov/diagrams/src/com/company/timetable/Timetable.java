package com.company.timetable;

import java.util.ArrayList;

public class Timetable {
    private ArrayList<String> timetable;
    public void fillTimetable(String element){
        timetable.add(element);
    }
    public ArrayList<String> getTimetable(){
        return timetable;
    }
}
