package vehicles;
import transport.ElectricTransport;

public class Trolley extends ElectricTransport{
    @Override
    public void run() {
        System.out.println("Trolley is running");
    }
}
