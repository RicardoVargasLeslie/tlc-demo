package com.tlc.demo.consumer.consumerservice.service;


import com.tlc.demo.consumer.consumerservice.entity.Message;
import com.tlc.demo.consumer.consumerservice.mapper.ObjectMapper;
import com.tlc.demo.consumer.consumerservice.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsumerBroker implements ConsumerService {

    @Autowired
    private MessageService persistenceService;

    @Override
    public MessageResponse receive(MessageResponse messageResponse) {

        Message entity;
        entity = ObjectMapper.map(messageResponse, Message.class);
        entity.setId(UUID.randomUUID());
        System.err.println("entity "+ entity.toString());
        this.persistenceService.save(entity);
        return messageResponse;
    }
}
