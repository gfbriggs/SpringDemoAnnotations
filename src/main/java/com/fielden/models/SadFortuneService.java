package com.fielden.models;

import com.fielden.interfaces.FortuneService;

public class SadFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "You will be sad all the time";
    }
}
