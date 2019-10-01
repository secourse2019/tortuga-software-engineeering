package com.company.Transport.dpo.transport;

import com.company.Transport.PaymentSystem;

public interface Transport {

    void WillSpendOnTheRoad(int distance, boolean necc);

    void Refueling();

    boolean Necessity(boolean nec);

    public Platform getMovementMethod();

    public void setMovementMethod(Platform movementMethod);

    public String getNumber();

    public void setNumber(String number);

    public PaymentSystem getPay();

    public void setPay(PaymentSystem pay);
}
