package com.company.persons;

import com.company.transport.Transport;
import com.company.persons.employeeEquipment.controllerEquipment.ControllerShaitanMachine;
import com.company.persons.employeeEquipment.controllerEquipment.CameraOfController;

import java.util.ArrayList;

public class Controller extends Employee {
    private ControllerShaitanMachine shaitanMachine;
    private CameraOfController camera;

    public Controller(String name, String surname, int age, int health, int salary) {
        super(name, surname, age, salary, health);
        shaitanMachine = new ControllerShaitanMachine();
        camera = new CameraOfController();
    }

    private void beatThePidor() {
        System.out.println("POLUCHAI PIDORAS");
    }

    public void checkPayment(Transport transport) {
        ArrayList<Passanger> passangers = transport.getPassangers();
        for(int i = 0; i != passangers.size(); ++i) {
            shaitanMachine.beepOfShaitanMachine();
            if(!passangers.get(i).getIsPayed()) {
                passangers.get(i).subHealth(10);
                camera.addIntruder(passangers.get(i));
                beatThePidor();
            }
            System.out.println("spasibo pidor");
        }
    }
}
