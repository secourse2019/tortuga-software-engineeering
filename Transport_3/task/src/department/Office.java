package department;

import people.Employee;

import java.util.ArrayList;

public class Office {
    Integer address;
    private ArrayList<Employee> employee;

    public Office(){};
    Office(Integer address, ArrayList <Employee> employee){
        this.address = address;
        this.employee = employee;
    }
}
