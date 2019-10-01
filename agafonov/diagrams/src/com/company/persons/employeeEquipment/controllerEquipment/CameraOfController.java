package com.company.persons.employeeEquipment.controllerEquipment;

import com.company.persons.Passanger;

import java.util.ArrayList;

public class CameraOfController {
    private int batteryOfCamera;
    private ArrayList<Passanger> intruders;

    public CameraOfController(){
        batteryOfCamera = 100;
    }
    public void setBatteryOfCamera(int batteryOfCamera) {
        if (batteryOfCamera > 100) {
            this.batteryOfCamera = 100;
        }
        else if (batteryOfCamera < 0) {
            this.batteryOfCamera = 0;
        }
        else this.batteryOfCamera = batteryOfCamera;
    }

    public void takeAPhoto(){
        int value = 5;
        if (value >= 100) this.batteryOfCamera = 100;
        if (value <= 0) this.batteryOfCamera += 0;
        if(value < 100 && value > 0) this.batteryOfCamera -= value;
    }
    public void addIntruder(Passanger passanger){
        takeAPhoto();
        this.intruders.add(passanger);
    }
    public ArrayList<Passanger> getListOfIntruder(){
        return intruders;
    }

}
