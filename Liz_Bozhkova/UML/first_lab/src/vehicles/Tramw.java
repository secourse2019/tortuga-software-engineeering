package vehicles;
import transport.ElectricTransport;

public class Tramw extends ElectricTransport{
    public Tramw() {}

    @Override
    public void run() {
        System.out.println("Tram is running");
    }
}
