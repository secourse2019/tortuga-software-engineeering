package com.company.Depo.Employer;

import com.company.Depo.PaymentSystem.PaymentSystem;

public class Employer extends Man {
    PaymentSystem pay;

    public Employer(PaymentSystem pay) {
        this.pay = pay;
    }

}
