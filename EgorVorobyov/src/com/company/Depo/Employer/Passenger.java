package com.company.Depo.Employer;

import com.company.Depo.PaymentSystem.PaymentSystem;

public class Passenger extends Man {
    PaymentSystem pay;

    Passenger(PaymentSystem pay) {
        this.pay = pay;
    }
}
