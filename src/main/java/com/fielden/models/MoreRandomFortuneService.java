package com.fielden.models;

import com.fielden.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
public class MoreRandomFortuneService implements FortuneService {

    @Value("${prop.randomFortunes}")
    private String[] randomFortunes;

    @Value("${prop.fortunePostConstruct}")
    private String postConstructMessage;

    private Random randomGenerator = new Random();

    @PostConstruct
    private void onPostConstruction(){
        System.out.println(postConstructMessage);
    }

    @Override
    public String getDailyFortune() {
        int randomNumber = randomGenerator.nextInt(randomFortunes.length);

        return randomFortunes[randomNumber];
    }
}
