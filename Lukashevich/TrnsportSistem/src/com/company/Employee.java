package com.company;

public class Employee
{
    private static int countID = 0;
    private int id;
    private String name;
    private String surname;
    public Position position;

    public Employee()
    {
        countID++;
        this.id = countID;
    }

    public int GetID ()
    {
        return this.id;
    }

    public void SetName (String name)
    {
       this.name = name;
    }

    public String GetName ()
    {
        return this.name;
    }

    public void SetSurame (String name)
    {
        this.surname = name;
    }

    public String GetSurame ()
    {
        return this.surname;
    }

}
