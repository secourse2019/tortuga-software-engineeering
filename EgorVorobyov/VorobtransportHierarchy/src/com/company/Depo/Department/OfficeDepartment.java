package com.company.Depo.Department;

public class OfficeDepartment implements Department {
    private int profitability;

    public OfficeDepartment(int profitability) {
        this.profitability = profitability;
    }

    int getProfitability() {
        return profitability;
    }
}
