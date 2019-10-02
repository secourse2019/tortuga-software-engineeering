
import java.util.*;

/**
 * 
 */
public class Passanger extends Person {

    /**
     * Default constructor
     */
    public Passanger() {
    }

    /**
     * 
     */
    public boolean isPayed = false;

    /**
     * 
     */
    public Transport useTransport;

    /**
     * @param useTransport
     */
    public void Passenger(void useTransport) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void Payed() {
        if super.money >= 10 {
            this.isPayed = true;
        }
        super.money -= 10;
        return null;
    }

}