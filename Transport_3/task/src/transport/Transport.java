package transport;

import people.Driver;
import people.Passengers;
import java.util.List;

public abstract class Transport {
    private List<Passengers> passangers;
    private String number;
    private Driver driver;

    Transport(String number) {
        this.number = number;
    }

    public List<Passengers> getPassengers(){
        return passangers;
    }

    public void addPassengers(Passengers pass){
        this.passangers.add(pass);
    }

    public abstract void run();

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

