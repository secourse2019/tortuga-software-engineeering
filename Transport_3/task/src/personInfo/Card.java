package personInfo;

import java.util.Date;

public class Card {
    private Integer number;
    private Date dateExpire;

    Card(Integer number, Date dateExpire){
        this.number = number;
        this.dateExpire = dateExpire;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDateExpire() {
        return dateExpire;
    }

    public void setDateExpire(Date dateExpire) {
        this.dateExpire = dateExpire;
    }
}

