package com.company.persons;

import com.company.persons.employeeEquipment.securityEquipment.Dubinka;

public class Security extends Employee {

    private Dubinka dubinka;

    Security(String name, String surname, int age, int helth, int salary, Dubinka dubinka) {
        super(name, surname, age, salary, helth);
        this.dubinka = dubinka;
    }

}
