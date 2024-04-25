package com.amir35.example.SpringBootBasic.annotationBased;

import com.amir35.example.SpringBootBasic.SpringBootBasicApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorldBean myBean =  context.getBean(HelloWorldBean.class);
        myBean.sayHello();

    }
}
