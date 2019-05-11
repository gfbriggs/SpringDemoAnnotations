package com.fielden.models;

import com.fielden.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice bating for ever";
    }

    @Override
    public String getFortune() {
        return null;
    }
}
