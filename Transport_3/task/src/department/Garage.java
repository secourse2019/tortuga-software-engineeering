package department;

import transport.GroundTransport;

import java.util.ArrayList;

public class Garage {
    Integer address;
    private ArrayList<GroundTransport> groundTransports;

    public Garage(){};
    Garage(Integer address, ArrayList <GroundTransport> groundTransports) {
        this.address = address;
        this.groundTransports = groundTransports;
    }
}
