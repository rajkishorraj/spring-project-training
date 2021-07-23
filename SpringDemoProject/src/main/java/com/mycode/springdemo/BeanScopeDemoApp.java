package com.mycode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String [] args) {
        //load the spring config file and create the application context i.e.,spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "beanScope-applicationContext.xml");
        //retrieve the bean from spring container
        BaseballCoach baseballCoach = context.getBean("myCoach",BaseballCoach.class);
        BaseballCoach alphaCoach = context.getBean("myCoach",BaseballCoach.class);

        System.out.println("Pointing to the same objects: " + (baseballCoach==alphaCoach));
        System.out.println("Memory location of both the objects are: " + baseballCoach + " " + alphaCoach);

        //call methods on the bean

        //close the context
        context.close();
    }
}
