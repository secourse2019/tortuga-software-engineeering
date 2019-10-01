package vehicles;

import people.Passangers;
import transport.GroundTransport;

public class Bus extends GroundTransport{
    public void fillFuel(GroundTransport transport){
        System.out.println("Fill fuel");
    }

    @Override
    public void run() {
        System.out.println("Bus is running");
    }

}
