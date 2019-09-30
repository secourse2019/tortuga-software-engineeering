package com.company;

public class UndetgroundTransport extends Transport
{
    public Security security;

    public UndetgroundTransport(Route r, Driver d, int n, Security security)
    {
        super(r, d, n);
        this.security = security;
    }
}
