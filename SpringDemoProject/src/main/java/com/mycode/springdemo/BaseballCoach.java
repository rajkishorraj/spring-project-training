package com.mycode.springdemo;

public class BaseballCoach implements Coach{

    //define private field for the dependency
    private FortuneService fortuneService;

    //create a constructor to inject the dependency
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public BaseballCoach() {

    }
    public String getDailyWorkOut() {
        return "Spend 30 minutes daily on batting exercise";
    }

    @Override
    public String getDailyFortune() {

        //use dependency to get the fortune
        return fortuneService.getFortune();
    }
}