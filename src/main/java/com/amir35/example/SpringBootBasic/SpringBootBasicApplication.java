package com.amir35.example.SpringBootBasic;

import com.amir35.example.SpringBootBasic.xmlBased.HelloWorldBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBootBasicApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootBasicApplication.class, args);

	}

}
