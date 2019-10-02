package vehicles;

import traffic.Routes;
import transport.FuelTransport;


public class Bus extends FuelTransport {

    Bus(Integer engineType, String number, Routes routes)
    {
        super(engineType, number, routes);
    }

    @Override
    public void run() {
        System.out.println("Bus is running");
    }
}
