package com.company.Person;

import com.company.transport.Subway;
import com.company.transport.Transport;

public class Security extends Worker {
    public Security(){}

    public Security(String name, String surname, int age, int salary) {
        super(name, surname, age, salary);
    }

    private void slapInTheAss(){
        System.out.println("Go to prison");
    }

    public void keepOrder(Subway subway){
        Passanger[] passangers = subway.getPassangers();
        for(int i = 0; i != passangers.length; ++i){
            if(passangers[i].getCrazyLevel() > 5){
                slapInTheAss();
            }
        }
    }

    public void checkPayment(Transport transport){
        Passanger[] passangers = transport.getPassangers();
        for(int i = 0; i != passangers.length; ++i){
            if(!passangers[i].getIsPayed()){
                slapInTheAss();
            }
            System.out.println("Thank u");
        }
    }
}
