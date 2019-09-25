package com.company.dpo.employer;

import com.company.PaymentSystem;

public class Passenger extends Person {

    PaymentSystem pey;

    Passenger(PaymentSystem pey) {
        this.pey = pey;
    }
}
