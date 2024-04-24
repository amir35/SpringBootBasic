package com.amir35.example.SpringBootBasic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HelloWorldBean helloWorldBean() {
        HelloWorldBean bean = new HelloWorldBean();
        bean.setMessage("Hello from MyBean!");
        return bean;
    }
}
