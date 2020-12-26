package com.tlc.demo.consumer.consumerservice.response;


public class MessageResponse {
    private String name;

    public MessageResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
