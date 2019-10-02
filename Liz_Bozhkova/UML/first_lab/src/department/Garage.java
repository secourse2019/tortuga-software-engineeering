package department;

import transport.GroundTransport;

public class Garage {
    Integer address;
    GroundTransport [] groundTransports;

    public Garage(){}
    Garage(Integer address, GroundTransport [] groundTransports) {
        this.address = address;
        this.groundTransports = groundTransports;
    }
}
