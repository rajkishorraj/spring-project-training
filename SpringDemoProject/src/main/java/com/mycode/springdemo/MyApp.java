package com.mycode.springdemo;

public class MyApp {

    public static void main(String [] args) {
        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkOut());
        System.out.println(theCoach.getDailyFortune());

        Coach baseballCoach = new BaseballCoach();
        System.out.println(baseballCoach.getDailyWorkOut());
//        System.out.println(baseballCoach.getDailyFortune());
    }
}
