package transport;

public abstract class FuelTransport {

    Integer engineType;

    abstract void toFuel();

    public FuelTransport(){};
    FuelTransport(Integer engineType){
        this.engineType = engineType;
    }
}
