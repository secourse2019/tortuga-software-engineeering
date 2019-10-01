package com.company.Person;

import com.company.transport.Transport;

public class Blogger extends Worker {
    public Blogger(){}

    public Blogger(String name, String surname, int age, int salary) {
        super(name, surname, age, salary);
    }

    private void slapInTheAss(){
        System.out.println("Pay a tax");
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
