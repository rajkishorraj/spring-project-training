package com.mycode.springconfig;

import com.mycode.springdemo.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringConfigDemoApp {

    public static void main(String [] args) {
        //load the spring config file and create the application context i.e.,spring container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //retrieve the bean from spring container
//        Coach tennisCoach1 = context.getBean("tennis",Coach.class);
        Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
        //call methods on the bean
        System.out.println(tennisCoach.getDailyWorkOut());
        System.out.println(tennisCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
