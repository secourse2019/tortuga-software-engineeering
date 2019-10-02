package people;
import transport.GroundTransport;

public class Driver extends Person {

    Driver(String name, String surname){ super(name, surname); }

    public void fillFuel(GroundTransport transport){
        System.out.println("Fill fuel");
    }
}
