package com.company;

import java.security.PublicKey;
import java.util.ArrayList;

public class TransportSistem {

    private ArrayList<Transport> transports = null;
    private ArrayList<Department> departments;
    private double budget;

    public TransportSistem( Double startBudget)
    {
        this.budget = startBudget;
    }

    public void PaySalary()
    {
        double cost = 0;
        for (int i = 0; i < departments.size(); i++) {
            for (int j = 0; j < departments.get(i).employees.size(); j++) {

                cost += departments.get(i).employees.get(j).position.GetSalary();
            }
        }

        this.budget -= cost;
    }

    public void AddTraanport (Transport t)
    {
        this.transports.add(t);
    }

    public void AddDepartment (Department d)
    {
        this.departments.add(d);
    }

    private int FindIndexByID (int id)
    {
        for (int i = 0; i < this.transports.size(); i++) {
            if (transports.get(i).id == id)
            {
                return i;
            }
        }
        return -1;
    }

    public void RepairTransport(int id)
    {
        this.transports.remove(FindIndexByID(id));
    }
}
