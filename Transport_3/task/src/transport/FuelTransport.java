package transport;

import traffic.Routes;

public abstract class FuelTransport extends GroundTransport {

    private Integer engineType;

    public FuelTransport(Integer engineType, String number, Routes routes){
        super(number, routes);
        this.engineType = engineType;
    }

    public Integer getEngineType() {
        return engineType;
    }

    public void setEngineType(Integer engineType) {
        this.engineType = engineType;
    }
}
