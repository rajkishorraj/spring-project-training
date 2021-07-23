package com.mycode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String [] args) {
        //load the spring config file and create the application context i.e.,spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //retrieve the bean from spring container
        CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
        //call methods on the bean
        System.out.println(cricketCoach.getDailyWorkOut());
        System.out.println(cricketCoach.getEmailAddress() + " " + cricketCoach.getTeam());
        //close the context
        context.close();
    }
}
