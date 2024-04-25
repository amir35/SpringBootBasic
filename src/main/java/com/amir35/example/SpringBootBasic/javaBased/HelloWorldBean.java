package com.amir35.example.SpringBootBasic.javaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class HelloWorldBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println(message);
    }
}
