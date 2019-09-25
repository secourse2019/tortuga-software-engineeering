package vehicles;
import transport.ElectricTransport;

public class Tramw extends ElectricTransport{
    @Override
    public void run() {
        System.out.println("Tram is running");
    }
}
