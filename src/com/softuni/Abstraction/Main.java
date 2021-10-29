package com.softuni.Abstraction;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Name
        //Months
        //average temperature
        List<Season> seasons = new ArrayList<>();
        Season summer = new Season("Summer", 25, "July", "August");
        Season winter = new Season("Winter", 5, "December", "January");
//        Season spring = new Season("Winter", 5, "December", "January");
//....
        seasons.add(summer);
        seasons.add(winter);
        System.out.println(Seasons.SUMMER.getAverageTemperature());
        Person person = new Person();
    }

    public int getA(){
        return 5;
    }


}
