package vehicles;
import transport.ElectricTransport;

public class Trolley extends ElectricTransport{
    public Trolley() {}

    @Override
    public void run() {
        System.out.println("Trolley is running");
    }
}
