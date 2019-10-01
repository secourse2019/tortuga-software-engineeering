package com.company.transport;

public class TurnStiles implements IPayment {
    @Override
    public boolean paymentMethod(EnumPayments paymentType) {
        if(paymentType != EnumPayments.card) {
            return false;
        }
        return true;
    }
}
