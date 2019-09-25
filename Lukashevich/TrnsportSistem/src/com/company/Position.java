package com.company;

public class Position
{
    private double salary;

    public Position ()
    {
        System.out.println("Position ()");
    }

    public void SetSalary (double salary)
    {
        System.out.println("SetSalary ()");
    }

    public double GetSalary ()
    {
        System.out.println("GetSalary ()");
        return 0;
    }

}
