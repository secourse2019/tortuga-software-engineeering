package vehicles;

import transport.FuelTransport;

public class Bus extends FuelTransport{

    public Bus() {}

    public void fillFuel(FuelTransport transport){
        System.out.println("Fill fuel");
    }

    @Override
    public void run() {
        System.out.println("Bus is running");
    }
}
