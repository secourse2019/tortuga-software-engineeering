package people;


import personInfo.CardId;
import personInfo.Position;

public class Employee {
    Position position;
    CardId cardId;

    public Employee(){}
    Employee(Position position, CardId cardId){
        this.position = position;
        this.cardId = cardId;
    }
}
