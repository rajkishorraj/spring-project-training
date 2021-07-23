package com.mycode.springdemo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkOut() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return String.valueOf(fortuneService);
    }

    //add an init method
    private void initMethod() {
        System.out.println("inside initialization step");
    }

    //add an destroy method
    private void destroyMethod() {
        System.out.println("inside tear down step");
    }
}
