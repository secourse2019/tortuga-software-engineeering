package transport;

import people.Driver;
import traffic.Routes;

public abstract class GroundTransport extends Transport {
    Routes routes;
    Driver driver;
    Integer numberId;
}
