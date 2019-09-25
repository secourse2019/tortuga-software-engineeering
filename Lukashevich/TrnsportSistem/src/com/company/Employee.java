package com.company;

public class Employee
{
    private String name;
    private String surname;
    private Position position;

    public Employee()
    {
        System.out.println("Employee()");
    }

    public void SetName (String name)
    {
        System.out.println("SetName()");
    }

    public void GetName ()
    {
        System.out.println("GetName()");
    }

    public void SetSurame (String name)
    {
        System.out.println("SetSurame()");
    }

    public void GetSurame ()
    {
        System.out.println("GetSurame()");
    }
}
