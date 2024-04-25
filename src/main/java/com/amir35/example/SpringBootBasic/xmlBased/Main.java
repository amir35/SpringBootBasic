package com.amir35.example.SpringBootBasic.xmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        /*
		1. ClassPathXmlApplicationContext:
		This ApplicationContext container loads context definitions from XML files located in the classpath.
		 */
        String config_loc = "classPathXmlApplicationContext.xml";
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(config_loc);
        HelloWorldBean classPathXmlApplicationContextBean = (HelloWorldBean) classPathXmlApplicationContext.getBean("helloWorldBean");
        classPathXmlApplicationContextBean.sayHello();

		/*
		2. FileSystemXmlApplicationContext:
		This container loads context definitions from XML files located in the file system.
		 */
        String config_loc2 = "D:\\SpringBoot Projects\\SpringBootBasic\\src\\main\\java\\com\\amir35\\example\\SpringBootBasic\\xmlBased\\fileSystemXmlApplicationContext.xml";
        ApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext(config_loc2);
        HelloWorldBean fileSystemXmlApplicationContextBean = (HelloWorldBean) fileSystemXmlApplicationContext.getBean("helloWorldBean");
        fileSystemXmlApplicationContextBean.sayHello();
    }
}
