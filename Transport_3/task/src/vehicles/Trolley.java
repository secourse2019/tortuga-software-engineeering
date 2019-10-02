package vehicles;

import traffic.Routes;
import transport.ElectricEngineTypes;
import transport.ElectricTransport;

public class Trolley extends ElectricTransport{
    public Trolley(ElectricEngineTypes engineType, String number, Routes routes) {
        super(engineType, number, routes);
    }

    @Override
    public void run() {
        System.out.println("Trolley is running");
    }
}
