package com.fielden;

import com.fielden.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Coach theCoach = context.getBean("tenisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tenisCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println(result);

        System.out.println(theCoach);

        System.out.println(alphaCoach);

        context.close();
    }
}