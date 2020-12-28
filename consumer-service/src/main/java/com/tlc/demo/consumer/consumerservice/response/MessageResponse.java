package com.tlc.demo.consumer.consumerservice.response;


import java.io.Serializable;

public class MessageResponse implements Serializable {
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
