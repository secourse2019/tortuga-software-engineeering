package department;

import people.Employee;

public interface Department {
    void hireEmployee(Employee employee);
    void sackEmployee(int index);
}
