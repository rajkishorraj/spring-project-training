package com.mycode.springconfig;

import com.mycode.springannotation.DailyWorkout;
import com.mycode.springdemo.Coach;
import com.mycode.springdemo.FortuneService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Component
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @Value("${coach.email:rajkr}")
    private String emailId;


    public FootballCoach() {
        System.out.println("Inside Constructor FootballCoach");
    }

    @PostConstruct
    public void init() {
        System.out.println("Inside post Construct method FootballCoach");
    }

    @Override
    public String getDailyWorkOut() {
        return "daily workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Inside pre destroy method FootballCoach");
    }
}
