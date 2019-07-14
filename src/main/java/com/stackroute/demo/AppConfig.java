package com.stackroute.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
    @Bean(value = {"beanLifeCycle"}, initMethod = "customInit", destroyMethod = "customDestroy")
    public BeanLifeCycleDemoBean beanLifeCycleDemo() {
        return new BeanLifeCycleDemoBean();
    }

}
