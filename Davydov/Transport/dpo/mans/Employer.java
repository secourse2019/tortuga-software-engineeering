package com.company.Transport.dpo.mans;

import com.company.Transport.PaymentSystem;

public class Employer extends Person{

    PaymentSystem pay;

    public Employer(PaymentSystem pay, String name, String surname, int age) {
        super(name, surname, age);
        this.pay = pay;
    }
}
