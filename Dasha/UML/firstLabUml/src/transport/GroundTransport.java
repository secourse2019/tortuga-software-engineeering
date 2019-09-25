package transport;

import people.Driver;
import traffic.Routes;

public abstract class GroundTransport implements Transport {
    Routes routes;
    Driver driver;
    Integer numberId;
}
