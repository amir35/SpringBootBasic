package com.amir35.example.SpringBootBasic.javaBased;

import com.amir35.example.SpringBootBasic.SpringBootBasicApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Main {

    @Bean
    public HelloWorldBean helloWorldBean() {
        HelloWorldBean myBean = new HelloWorldBean();
        myBean.setMessage("Hello from MyBean!");
        return myBean;
    }

    public static void main(String[] args) {

        /*
		3. AnnotationConfigApplicationContext:
		This container loads context definitions from Java configuration classes annotated with Spring's @Configuration.
		 */
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Main.class);
        HelloWorldBean annotationConfigApplicationContextBean =  annotationConfigApplicationContext.getBean(HelloWorldBean.class);
        annotationConfigApplicationContextBean.sayHello();

        HelloWorldBean annotationConfigApplicationContextBean2 = (HelloWorldBean) annotationConfigApplicationContext.getBean("helloWorldBean");
        annotationConfigApplicationContextBean2.sayHello();

        ApplicationContext annotationConfigApplicationContext1 = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorldBean annotationConfigApplicationContextBean3 = annotationConfigApplicationContext1.getBean(HelloWorldBean.class);
        annotationConfigApplicationContextBean3.sayHello();
    }
}
