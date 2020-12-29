package com.tlc.demo.producer.producerservice.request;


import java.io.Serializable;

public class MessageTest implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MessageTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
