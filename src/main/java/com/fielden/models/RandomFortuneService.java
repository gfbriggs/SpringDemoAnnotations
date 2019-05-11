package com.fielden.models;

import com.fielden.interfaces.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    String[] randomFortunes = {
        "Random nice fortune",
        "Random weird fortune",
        "Random cool fortune"
    };

    private Random randomGenerator = new Random();

    @Override
    public String getDailyFortune() {
        int randomNumber = randomGenerator.nextInt(randomFortunes.length);

        return randomFortunes[randomNumber];
    }
}
