package com.fielden.models;

import com.fielden.interfaces.Coach;
import com.fielden.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${prop.email}")
    private String email;

    @Value("${prop.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getTeam() {
        return team;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warmup!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getDailyFortune();
    }
}
