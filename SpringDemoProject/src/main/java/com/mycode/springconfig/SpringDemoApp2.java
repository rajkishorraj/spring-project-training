package com.mycode.springconfig;


import com.mycode.springdemo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoApp2 {

    public static void main(String [] args) {
//        load the spring config file and create the application context i.e.,spring container which will create
        //the bean for all the classes annotated with @component annotation.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //retrieve the bean from spring container
//        Coach tennisCoach1 = context.getBean("tennis",Coach.class);
//        FootballCoach footballCoach = context.getBean("footballCoach",FootballCoach.class);
//
//        System.out.println(footballCoach.getDailyWorkOut());
//        System.out.println(footballCoach.getEmailId());

        //close the context
        context.close();
    }
}
