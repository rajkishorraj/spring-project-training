package com.mycode.springdemo;

import lombok.Getter;

@Getter
public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public void setEmailAddress(String emailAddress) {
        System.out.println("inside email address setter method");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("inside team setter method");
        this.team = team;
    }

    public CricketCoach() {
        System.out.println("inside cricket coach no-arg constructor");
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //setter method will be called by spring inject dependency
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside fortune setter method");
        this.fortuneService = fortuneService;
    }
}
