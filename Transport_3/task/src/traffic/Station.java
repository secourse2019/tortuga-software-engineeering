package traffic;

public class Station {
    private Integer name;
    private Integer timetable;

    public Station(){};
    Station(Integer name, Integer timetable){
        this.name = name;
        this.timetable = timetable;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Integer getTimetable() {
        return timetable;
    }

    public void setTimetable(Integer timetable) {
        this.timetable = timetable;
    }
}
