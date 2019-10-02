package transport;

public abstract class ElectricTransport extends GroundTransport{
    public ElectricTransport() {}

    Integer engineType;
    ElectricTransport(Integer engineType){
        this.engineType = engineType;
    }
}
