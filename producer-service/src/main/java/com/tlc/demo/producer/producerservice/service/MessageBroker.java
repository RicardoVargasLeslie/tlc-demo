package com.tlc.demo.producer.producerservice.service;

import com.tlc.demo.producer.producerservice.request.MessageRequest;
import org.springframework.kafka.core.KafkaTemplate;

public class MessageBroker implements  MessageService{


    private KafkaTemplate template;

    @Override
    public void send(MessageRequest request) {

    }
}
