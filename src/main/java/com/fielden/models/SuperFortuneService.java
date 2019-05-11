package com.fielden.models;

import com.fielden.interfaces.FortuneService;

public class SuperFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "You will be super lucky with super things!";
    }
}
