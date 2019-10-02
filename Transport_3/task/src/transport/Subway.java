package transport;

public class Subway extends ElectricTransport {

    Subway(ElectricEngineTypes engineType, String number) {
        super(engineType, number);
    }

    public void run() {
        System.out.println("Subway is running");
    }
}
