package com.mycode.springannotation;

import org.springframework.stereotype.Component;

@Component
public class DailyWorkout {

    public String getWorkout() {
        return "daily work out session";
    }
}
