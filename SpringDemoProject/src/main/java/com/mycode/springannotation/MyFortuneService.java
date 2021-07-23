package com.mycode.springannotation;

import com.mycode.springdemo.FortuneService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "get daily fortune";
    }
}
