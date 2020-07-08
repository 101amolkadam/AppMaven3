package com.practice.AppMaven3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Practice on Spring Core Annotations
 * @Configuration, @Component, @Bean, @Autowired, @ComponentScan(basePackages = ""), @Primary, @Qualifier("")
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Use any one method
//    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig1.class);
    	
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
