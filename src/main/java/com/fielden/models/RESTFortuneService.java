package com.fielden.models;

import com.fielden.interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return null;
    }
}
