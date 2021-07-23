package com.mycode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String [] args) {
        //load the spring config file and create the application context i.e.,spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "beanLifeCycle-applicationContext.xml");
        //retrieve the bean from spring container
        TrackCoach trackCoach = context.getBean("myCoach",TrackCoach.class);

        //call methods on the bean
        System.out.println(trackCoach.getDailyWorkOut());
        //close the context
        context.close();
    }
}
