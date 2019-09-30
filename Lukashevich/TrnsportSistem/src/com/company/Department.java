package com.company;

import java.util.ArrayList;

public class Department
{

    public ArrayList <Employee> employees;
    private String address;
    public Dispatcher dispatcher;

    public Department()
    {
        System.out.println("Department ()");
    }

    private int FindEmpoerByID (int id)
    {
        for (int i = 0; i < this.employees.size() ; i++)
        {
           if (this.employees.get(i).GetID() == id)
           {
               return i;
           }
        }
        return -1;
    }

    public void DismissEmployee(int id)
    {
        this.employees.remove(FindEmpoerByID(id));
    }

    public void AcceptEmployee(Employee employee)
    {
        this.employees.add(employee);
    }

    public void SetAddress( String address)
    {
       this.address = address;
    }

    public String  GetAddress()
    {
        return this.address;
    }

}
