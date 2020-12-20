package com.tlc.demo.producer.producerservice.service;

import com.tlc.demo.producer.producerservice.request.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageBroker implements MessageService{

    @Autowired
    private KafkaTemplate template;
    private static final String TOPIC="tlc";

    @Override
    public String send(MessageRequest request) {
        this.template.send(TOPIC,request);
        return "JSON Published!";
    }
}
