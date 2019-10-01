package com.company.Transport.dpo.departmant;

public class OfficeDepartment implements Department {
    private int profitability;

    OfficeDepartment(int profitability) {
        this.profitability = profitability;
    }

    void defineProfitability() {
        System.out.println(profitability);
    }
}
