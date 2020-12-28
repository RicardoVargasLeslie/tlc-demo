package com.tlc.demo.consumer.consumerservice.request;


public class MessageRequest  {
    private String name;

    public MessageRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MessageRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
