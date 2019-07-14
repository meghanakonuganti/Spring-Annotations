package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Actor> actorBean(){
        List<Actor> actorList = new ArrayList<>(Arrays.asList(new Actor("meghana","female",21), new Actor("bunny","male",23)));
        return actorList;
    }
    @Bean
    public Movie movieBean()
    {
        Movie movie = new Movie(actorBean());
        return movie;
    }
}
