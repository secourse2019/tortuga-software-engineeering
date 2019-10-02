package vehicles;
import traffic.Routes;
import transport.ElectricEngineTypes;
import transport.ElectricTransport;

public class Tramw extends ElectricTransport{

    public Tramw(ElectricEngineTypes engineType, String number, Routes routes) {
        super(engineType, number, routes);
    }

    @Override
    public void run() {
        System.out.println("Tram is running");
    }
}
