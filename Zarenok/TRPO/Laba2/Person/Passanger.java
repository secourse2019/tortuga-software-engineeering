package com.company.Person;

import com.company.transport.Transport;


public class Passanger extends Person {
    private Boolean isPayed = false;
    private Transport transport;
    private String unit;

    Passanger(){}

    Passanger(String name, String surname, int age, Transport transport, int crazyLevel, String unit){
        super(name, surname, age, crazyLevel);
        this.setTransport(transport);
        this.setUnit(unit);
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
}
