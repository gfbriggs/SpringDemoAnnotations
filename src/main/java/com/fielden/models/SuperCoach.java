package com.fielden.models;

import com.fielden.interfaces.Coach;
import com.fielden.interfaces.FortuneService;

public class SuperCoach implements Coach {

    private FortuneService fortuneService;

    public SuperCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do the best of the super work outs!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getDailyFortune();
    }
}
