package com.amir35.example.SpringBootBasic.annotationBased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class HelloWorldBean {

    @Value("This is from Annotated based configuration")
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println(message);
    }
}
