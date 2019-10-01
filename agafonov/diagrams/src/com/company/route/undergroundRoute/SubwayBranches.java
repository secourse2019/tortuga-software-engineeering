package com.company.route.undergroundRoute;

import com.company.route.Branches;
import com.company.route.Coordinates;
import com.company.route.Station;

import java.util.HashMap;

public class SubwayBranches {
    private Branches firstBranch;
    private Branches secondBranch;

    public void fillFirstBranch() {
        firstBranch.fillSubwayLine(new Station(1,"Могилевская"), new Coordinates(1,1));
        firstBranch.fillSubwayLine(new Station(2,"Автозаводская"), new Coordinates(1,2));
        firstBranch.fillSubwayLine(new Station(3,"Партизанская"), new Coordinates(1,3));
        firstBranch.fillSubwayLine(new Station(4,"Пролетарская"), new Coordinates(1,4));
        firstBranch.fillSubwayLine(new Station(5,"Тракторный завод"), new Coordinates(1,5));
        firstBranch.fillSubwayLine(new Station(6,"Первомайская"), new Coordinates(1,6));
        firstBranch.fillSubwayLine(new Station(7,"Купаловская"), new Coordinates(1,7));
        firstBranch.fillSubwayLine(new Station(8,"Немига"), new Coordinates(1,8));
        firstBranch.fillSubwayLine(new Station(9,"Фрунзенская"), new Coordinates(1,9));
        firstBranch.fillSubwayLine(new Station(10,"Молодежная"), new Coordinates(1,10));
        firstBranch.fillSubwayLine(new Station(11,"Пушкинская"), new Coordinates(1,11));
        firstBranch.fillSubwayLine(new Station(12,"Спортивная"), new Coordinates(1,12));
        firstBranch.fillSubwayLine(new Station(13,"Кунцевщина"), new Coordinates(1,13));
        firstBranch.fillSubwayLine(new Station(14,"Каменная горка"), new Coordinates(1,14));
    }

    public Branches getFirstBranch() {
        return firstBranch;
    }

    public void fillSecondBranch() {
        secondBranch.fillSubwayLine(new Station(1,"Могилевская"), new Coordinates(2,1));
        secondBranch.fillSubwayLine(new Station(2,"Автозаводская"), new Coordinates(2,2));
        secondBranch.fillSubwayLine(new Station(3,"Партизанская"), new Coordinates(2,3));
        secondBranch.fillSubwayLine(new Station(4,"Пролетарская"), new Coordinates(2,4));
        secondBranch.fillSubwayLine(new Station(5,"Тракторный завод"), new Coordinates(2,5));
        secondBranch.fillSubwayLine(new Station(6,"Первомайская"), new Coordinates(2,6));
        secondBranch.fillSubwayLine(new Station(7,"Купаловская"), new Coordinates(2,7));
        secondBranch.fillSubwayLine(new Station(8,"Немига"), new Coordinates(2,8));
        secondBranch.fillSubwayLine(new Station(9,"Фрунзенская"), new Coordinates(2,9));
        secondBranch.fillSubwayLine(new Station(10,"Молодежная"), new Coordinates(2,10));
        secondBranch.fillSubwayLine(new Station(11,"Пушкинская"), new Coordinates(2,11));
        secondBranch.fillSubwayLine(new Station(12,"Спортивная"), new Coordinates(2,12));
        secondBranch.fillSubwayLine(new Station(13,"Кунцевщина"), new Coordinates(2,13));
        secondBranch.fillSubwayLine(new Station(14,"Каменная горка"), new Coordinates(2,14));
    }

    public Branches getSecondBranch() {
        return secondBranch;
    }

    public HashMap<Station, Coordinates> getCurrentFirstBranchElement(int index){
        return this.firstBranch.get(index);
    }
}
