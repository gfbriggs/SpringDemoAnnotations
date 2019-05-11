package com.fielden;

import com.fielden.interfaces.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCodeConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("tenisCoach", Coach.class);

        System.out.println(coach.getFortune());
        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
