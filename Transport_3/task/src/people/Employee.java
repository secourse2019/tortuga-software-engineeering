package people;

import personInfo.Card;
import personInfo.Position;

public class Employee extends Person {
    private Position position;
    private Card card;

    Employee(Position position, Card card, String name, String surname){
        super(name, surname);
        this.position = position;
        this.card = card;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
