package com.company.Person;

import com.company.Station;
import com.company.transport.Transport;


public class Passanger extends Person {
    private Boolean isPayed = false;
    private Transport transport;
    private String unit;
    private boolean inTransport;
    private Station outStation;

    Passanger(){}

    Passanger(String name, String surname, int age, Transport transport, String unit, boolean inTransport, Station outStation){
        super(name, surname, age);
        this.setTransport(transport);
        this.setUnit(unit);
        this.setInTransport(inTransport);
        this.setOutStation(outStation);
    }


    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Boolean getIsPayed(){
        return isPayed;
    }

    public void Payed(){
        if(this.transport.check(this.unit)){
            this.isPayed = true;
        }
        System.out.println("Payed, suka");
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public boolean isInTransport() {
        return inTransport;
    }

    public void setInTransport(boolean inTransport) {
        this.inTransport = inTransport;
    }

    public Station getOutStation() {
        return outStation;
    }

    public void setOutStation(Station outStation) {
        this.outStation = outStation;
    }
}
