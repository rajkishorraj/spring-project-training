package com.mycode.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String [] args) {
        //Creating the Spring Container by using the xml configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //getting the beans
        Coach theCoach = context.getBean("myCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkOut());

        System.out.println(theCoach.getDailyFortune());

        //closing the context
        context.close();
    }
}
