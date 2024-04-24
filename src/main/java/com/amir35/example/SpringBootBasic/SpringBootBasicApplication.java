package com.amir35.example.SpringBootBasic;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class SpringBootBasicApplication {

	@Bean
    public HelloWorldBean helloWorldBean() {
    	HelloWorldBean myBean = new HelloWorldBean();
        myBean.setMessage("Hello from MyBean!");
        return myBean;
    }

	public static void main(String[] args) {

		/*
		1. ClassPathXmlApplicationContext:
		This ApplicationContext container loads context definitions from XML files located in the classpath.
		 */
		ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classPathXmlApplicationContext.xml");
		HelloWorldBean classPathXmlApplicationContextBean = (HelloWorldBean) classPathXmlApplicationContext.getBean("helloWorldBean");
		classPathXmlApplicationContextBean.sayHello();

		/*
		2. FileSystemXmlApplicationContext:
		This container loads context definitions from XML files located in the file system.
		 */
		ApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("D:\\SpringBoot Projects\\SpringBootBasic\\src\\main\\resources\\fileSystemXmlApplicationContext.xml");
		HelloWorldBean fileSystemXmlApplicationContextBean = (HelloWorldBean) fileSystemXmlApplicationContext.getBean("helloWorldBean");
		fileSystemXmlApplicationContextBean.sayHello();

		/*
		3. AnnotationConfigApplicationContext:
		This container loads context definitions from Java configuration classes annotated with Spring's @Configuration.
		 */
		ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringBootBasicApplication.class);
		HelloWorldBean annotationConfigApplicationContextBean =  annotationConfigApplicationContext.getBean(HelloWorldBean.class);
		annotationConfigApplicationContextBean.sayHello();

	}

}
