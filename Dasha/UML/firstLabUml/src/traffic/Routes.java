package traffic;

import transport.Transport;

public class Routes {
    Transport transport;
    Integer stations;
    Integer number;

    public Routes(){};
    Routes(Transport transport, Integer stations, Integer number){
        this.transport = transport;
        this.stations = stations;
        this.number = number;
    }
}
