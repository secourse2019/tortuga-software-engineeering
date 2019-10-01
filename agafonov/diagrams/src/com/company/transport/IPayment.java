package com.company.transport;

enum EnumPayments {
    ticket, token, card
}

public interface IPayment {
    boolean paymentMethod(EnumPayments paymentType);
}
