package com.mycode.springdemo;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Good luck";
    }
}
