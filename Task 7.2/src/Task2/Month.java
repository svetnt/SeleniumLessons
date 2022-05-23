package Task2;

import Task2.IMonth;

public class Month implements IMonth {

    String name;
    int day;
    int rabDay;

    Month(String name, int day, int rabDay) {
        this.name = name;
        this.day = day;
        this.rabDay = rabDay;
    }

    public int getRabDay(){
        return rabDay;
    }


}