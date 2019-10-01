package com.company.transport;

enum Types {
    electric, petrol
}

public interface IUsedTypeOfFuel {
    void setUsedTypeOfFuel(Types type);
}
