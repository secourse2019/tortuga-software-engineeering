package com.company.Person;

import com.company.transport.Transport;

import java.util.List;

public class Blogger extends Worker {
    public Blogger() {}

    public Blogger(String name, String surname, int age, int crazyLevel,int salary) {
        super(name, surname, age, crazyLevel, salary);
    }

    private void slapInTheAss() {
        System.out.println("Pay a tax");
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
