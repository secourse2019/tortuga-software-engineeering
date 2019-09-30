package com.company.Transport.dpo.mans;

import com.company.Transport.PaymentSystem;

public class Passenger extends Person {

    PaymentSystem pey;

    Passenger(PaymentSystem pey, String name, String surname, int age) {
        super(name, surname, age);
        this.pey = pey;
    }
}
