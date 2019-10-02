
import java.util.*;

/**
 * 
 */
public class Person {

    /**
     * Default constructor
     */
    public Person(String name, String surname, int age, BigDecimal money) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.money = money;
    }
    /**
     * 
     */
    
    public Person() {
        this.name = "Vasya"
        this.surrname = "Pupkin"
        this.age = 24
        this.money = 100
    }

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public String surname;

    /**
     * 
     */
    public int age;

    /**
     * 
     */
    public BigDecimal money;

    /**
     * @param name 
     * @param surrname 
     * @param age
     */
    public void Person(void name, void surrname, void age) {
        // TODO implement here
    }

}