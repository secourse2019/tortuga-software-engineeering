package com.company.Transport.dpo.mans;

import com.company.Transport.PaymentSystem;

public class Passenger extends Person {

    PaymentSystem pay;

    Passenger(PaymentSystem pay, String name, String surname, int age) {
        super(name, surname, age);
        this.pay = pay;
    }
}
