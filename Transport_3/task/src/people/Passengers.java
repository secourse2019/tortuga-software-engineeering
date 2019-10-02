package people;

import java.math.BigDecimal;

public class Passengers extends Person{
    private BigDecimal money;

    Passengers(BigDecimal money, String name, String surname){
        super(name, surname);
        this.money = money;
    }

    public BigDecimal giveMoney() {
        return money;
    }

    public void stillMoney(BigDecimal money) {
        this.money = money;
    }
}
