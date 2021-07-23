package com.mycode.springannotation;

import com.mycode.springdemo.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "get random daily fortune";
    }
}
