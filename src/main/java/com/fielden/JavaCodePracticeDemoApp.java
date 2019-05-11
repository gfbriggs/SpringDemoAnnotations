package com.fielden;

import com.fielden.interfaces.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCodePracticeDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("superCoach", Coach.class);

        System.out.println(coach.getFortune());
        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
