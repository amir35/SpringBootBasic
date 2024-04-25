package com.amir35.example.SpringBootBasic.xmlBased;

public class HelloWorldBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println(message);
    }
}
