package com.mycode.springannotation;

import com.mycode.springdemo.Coach;
import com.mycode.springdemo.FortuneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;




//    @Autowired
//    public void setFortuneService (FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

//    @Autowired
//    public TennisCoach (FortuneService fortuneService, DailyWorkout dailyWorkout) {
//        this.fortuneService = fortuneService;
//        this.dailyWorkout = dailyWorkout;
//    }

    public TennisCoach () {
        System.out.println("Inside Tennis Constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Inside Tennis post Construct method");
    }

    @Override
    public String getDailyWorkOut() {
        return "daily work0ut message";
    }

    @Override
    public String getDailyFortune() {
        String data [] = {
                "be safe",
                "be alert",
                "have a nice day"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(data.length);
        return data[randomIndex];
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Inside Tennis pre destroy method");
    }
}
