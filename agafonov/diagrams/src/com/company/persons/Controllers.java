package com.company.persons;

import com.company.transport.Transport;

public class Controllers extends Employee{

    public Controllers(String name, String surname, int age, int salary){
        super(name, surname, age, salary);
    }

    private void beatThePidor(){
        System.out.println("POLUCHAI PIDORAS");
    }

    public void checkPayment(Transport transport){
        Passanger[] passangers = transport.getPassangers();
        for(int i = 0; i != passangers.length; ++i){
            if(!passangers[i].getIsPayed()){
                beatThePidor();
            }
            System.out.println("Thank u");
        }
    }
}
