package department;

import people.Employee;

public class Office {
    Integer address;
    Employee [] employee;

    public Office(){};
    Office(Integer address, Employee [] employee){
        this.address = address;
        this.employee = employee;
    }
}
