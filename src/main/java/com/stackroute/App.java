package com.stackroute;


import com.stackroute.demo.AppConfig;
import com.stackroute.demo.BeanLifeCycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ((AnnotationConfigApplicationContext) context).registerShutdownHook();
        BeanLifeCycleDemoBean beanLifeCycleDemo=(BeanLifeCycleDemoBean) context.getBean("beanLifeCycle");
    }
}
