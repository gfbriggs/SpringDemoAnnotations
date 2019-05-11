package com.fielden;

import com.fielden.interfaces.Coach;
import com.fielden.interfaces.FortuneService;
import com.fielden.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("sport.properties")
@ComponentScan("com.fielden.models")
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
        return mySwimCoach;
    }

    @Bean
    public FortuneService sadFortuneService() {
        SadFortuneService fortuneService = new SadFortuneService();
        return fortuneService;
    }

    @Bean
    public FortuneService superFortuneService() {
        SuperFortuneService superFortuneService = new SuperFortuneService();
        return superFortuneService;
    }

    @Bean
    public Coach superCoach() {
        SuperCoach superCoach = new SuperCoach(superFortuneService());
        return superCoach;
    }
}
