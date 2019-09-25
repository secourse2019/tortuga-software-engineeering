package com.company.dpo.transport;

public interface Transport {

    void WillSpendOnTheRoad(int distance, boolean necc);
    void Refueling();
    boolean Necessity(boolean nec);
}
