package com.stackroute;

import com.stackroute.domain.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Application {
    public static void main(String[] args) {

        BeanFactory xmlBeanFactory = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movieFirst = (Movie) xmlBeanFactory.getBean("movieBean");
        Movie moviesecond = (Movie) xmlBeanFactory.getBean("movieBean");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie=(Movie)applicationContext.getBean("movieBean");
        Movie movie2=(Movie)applicationContext.getBean("movieBean");
        // Movie movieB=(Movie)applicationContext.getBean("movieB");
        System.out.println(movieFirst.getActor());
        System.out.println(moviesecond.getActor());
        moviesecond.getActor();
        System.out.println(  movie.getActor());
        movie2.getActor();
        System.out.println(movie==movie2);
        System.out.println(movieFirst==moviesecond);
        // System.out.println( movieB.getActor());
    }
}
