package com.company.persons.employeeEquipment.controllerEquipment;

public class CameraOfController {
    private int batteryOfCamera;
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

}
