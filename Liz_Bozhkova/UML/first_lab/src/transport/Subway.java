package transport;

public class Subway implements Transport {
    public Subway() {}
    @Override
    public void run() {
        System.out.println("Subway is running");
    }
}
