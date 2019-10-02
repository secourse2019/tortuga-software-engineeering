package department;

import geolocation.Geolocation;
import people.Employee;
import java.util.List;

public class Office implements Department {
    private Geolocation geolocation;
    private List<Employee> employees;

    Office(Geolocation geolocation){
        this.geolocation = geolocation;
    }

    @Override
    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void sackEmployee(int index) {
        employees.remove(index);
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }
}
