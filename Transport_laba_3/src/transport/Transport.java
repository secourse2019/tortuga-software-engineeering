package transport;

import people.Passangers;

import java.util.ArrayList;

public class Transport {
    public void run(){}
    private ArrayList<Passangers> passangers;

    public ArrayList<Passangers> getPassangers(){
        return passangers;
    }

    public void addPassangers(Passangers pass){
        this.passangers.add(pass);
    }
}

