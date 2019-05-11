package com.fielden;

import com.fielden.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Coach tenisCoach  = context.getBean("tenisCoach", Coach.class);

        Coach baseballCoach  = context.getBean("baseballCoach", Coach.class);

        System.out.println(tenisCoach.getDailyWorkout());

        System.out.println(baseballCoach.getDailyWorkout());

        context.close();
    }
}
