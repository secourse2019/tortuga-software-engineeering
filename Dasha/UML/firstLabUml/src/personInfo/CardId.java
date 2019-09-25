package personInfo;

import java.util.Date;

public class CardId {
    Integer number;
    Date dateExpire;

    public CardId(){};
    CardId(Integer number, Date dateExpire){
        this.number = number;
        this.dateExpire = dateExpire;
    }
}

