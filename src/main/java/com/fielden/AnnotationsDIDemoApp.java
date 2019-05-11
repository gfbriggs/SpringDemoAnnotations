package com.fielden;

import com.fielden.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDIDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Coach tenisCoach  = context.getBean("tenisCoach", Coach.class);

        System.out.println(tenisCoach.getDailyWorkout());

        System.out.println(tenisCoach.getFortune());

        context.close();
    }
}
