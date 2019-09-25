package com.company.dpo.employer;

import com.company.PaymentSystem;

public class Employer extends Person{

    PaymentSystem pay;

    public Employer(PaymentSystem pay) {
        this.pay = pay;
    }
}
