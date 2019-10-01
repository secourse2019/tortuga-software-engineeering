package com.company.persons.employeeEquipment.controllerEquipment;

public class ControllerShaitanMachine {
    private boolean isCheckedForPayment;
    private int checkedPeoples;
    public ControllerShaitanMachine() {
        isCheckedForPayment = false;
        checkedPeoples = 0;
    }
    public ControllerShaitanMachine(boolean isCheckedForPayment) {
        this.isCheckedForPayment = isCheckedForPayment;
    }
    public void beepOfShaitanMachine() {
        checkedPeoples++;
    }
    public int getCheckedPeoples() {
        return checkedPeoples;
    }
}
