package transport;

public abstract class ElectricTransport extends GroundTransport{
    Integer engineType;

    public ElectricTransport(){};
    ElectricTransport(Integer engineType){
        this.engineType = engineType;
    }
}
