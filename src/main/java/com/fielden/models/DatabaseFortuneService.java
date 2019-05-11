package com.fielden.models;

import com.fielden.interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return null;
    }
}
