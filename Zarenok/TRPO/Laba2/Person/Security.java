package com.company.Person;

import com.company.transport.Subway;
import com.company.transport.Transport;

import java.util.List;

public class Security extends Worker {
    public Security(){}

    public Security(String name, String surname, int age, int crazyLevel, int salary) {
        super(name, surname, age, crazyLevel,salary);
    }

    private void slapInTheAss(){
        System.out.println("Go to prison");
    }

    public void keepOrder(Subway subway) {
        List<Passanger> passangers = subway.getPassangers();
        for(int i = 0; i != passangers.size(); ++i){
            if(passangers.get(i).getCrazyLevel() > 5){
                slapInTheAss();
            }
        }
    }

    public void checkPayment(Transport transport) {
        List<Passanger> passangers = transport.getPassangers();
        for(int i = 0; i != passangers.size(); ++i){
            if(!passangers.get(i).getIsPayed()){
                slapInTheAss();
            }
            System.out.println("Thank u");
        }
    }
}
