package transport;

public abstract class FuelTransport {
    public FuelTransport() {}

    Integer engineType;
    abstract void toFuel();

    FuelTransport(Integer engineType){
        this.engineType = engineType;
    }
}
