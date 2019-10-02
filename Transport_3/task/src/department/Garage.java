package department;

import geolocation.Geolocation;
import people.Employee;
import transport.GroundTransport;
import java.util.List;

public class Garage implements Department{
    private Geolocation geolocation;
    private List<GroundTransport> groundTransports;
    private List<Employee> employees;

    Garage(Geolocation geolocation, List<GroundTransport> groundTransports) {
        this.geolocation = geolocation;
        this.groundTransports = groundTransports;
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

    public List<GroundTransport> getGroundTransports() {
        return groundTransports;
    }

    public void setGroundTransports(List<GroundTransport> groundTransports) {
        this.groundTransports = groundTransports;
    }
}
