package traffic;

import transport.Transport;
import java.util.List;

public class Routes {
    private Transport transport;
    private List<Station> stations;
    private String number;

    public Routes(){};
    Routes(Transport transport, List<Station> stations, String number){
        this.transport = transport;
        this.stations = stations;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
