package com.fielden.models;

import com.fielden.interfaces.Coach;
import com.fielden.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TenisCoach implements Coach {

    @Autowired
    @Qualifier("moreRandomFortuneService")
    private FortuneService fortuneService;

    public TenisCoach() {
    }

    @PostConstruct
    public void doStartupStuff(){
        System.out.println("Do my startup stuff");
    }

    @PreDestroy
    public void doMyCleaningStuff(){
        System.out.println("Do my cleanup things");
    }

    public String getFortune() {
        return fortuneService.getDailyFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

}
