package com.company.transport;

public class Validator implements IPayment {
    @Override
    public boolean paymentMethod(EnumPayments paymentType) {
        if(paymentType != EnumPayments.card) {
            return false;
        }
        return true;
    }
}
