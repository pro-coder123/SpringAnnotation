package com.stackroute;


import com.stackroute.domain.Actor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public Actor getActor()
    {
        return new Actor("Varun","Male",21);
    }


}
