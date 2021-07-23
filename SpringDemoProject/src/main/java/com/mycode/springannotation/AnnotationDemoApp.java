package com.mycode.springannotation;

import com.mycode.springdemo.Coach;
import com.mycode.springdemo.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String [] args) {
        //load the spring config file and create the application context i.e.,spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextAnnotation.xml");
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
