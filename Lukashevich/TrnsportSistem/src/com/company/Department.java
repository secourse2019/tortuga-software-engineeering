package com.company;

public class Department
{

    private Employee[] employees;
    private String address;
    public Dispatcher dispatcher;

    public Department()
    {
        System.out.println("Department ()");
    }

    public void DismissEmployee(int id)
    {
        System.out.println("DismissEmployee ()" + id);
    }

    public void AcceptEmployee()
    {
        System.out.println("AcceptEmployee ()");
    }

    public void SetAddress( String address)
    {
        System.out.println("SetAddress ()");
    }

    public void  GetAddress( String address)
    {
        System.out.println("GetAddress ()");
    }

}
