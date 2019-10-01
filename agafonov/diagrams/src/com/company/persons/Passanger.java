package com.company.persons;

import com.company.transport.Transport;

public class Passanger extends Person {
    private boolean isPaid = false;
    private Transport usedTransport;

    public Passanger(String name, String surname, int age, int health, boolean isPaid, Transport usedTransport) {
        super(name, surname, age, health);
        this.isPaid = isPaid;
        this.usedTransport = usedTransport;
    }

    public Transport getTransport() {
        return usedTransport;
    }

    public Boolean getIsPayed() {
        return isPaid;
    }
}
