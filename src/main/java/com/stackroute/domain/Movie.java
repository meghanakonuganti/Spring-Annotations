package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Movie {
    @Autowired
    List<Actor> actor;

    public Movie(){
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    public List<Actor> getActor() {
        return actor;
    }
    public Movie(List<Actor> actor){
        this.actor=actor;
    }
    @Override
    public String toString(){
        return "actor="+actor;
    }
}
