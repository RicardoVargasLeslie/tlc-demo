package com.tlc.demo.consumer.consumerservice.service;


import com.tlc.demo.consumer.consumerservice.entity.Message;
import com.tlc.demo.consumer.consumerservice.mapper.ObjectMapper;
import com.tlc.demo.consumer.consumerservice.repository.MessageRepository;
import com.tlc.demo.consumer.consumerservice.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.UUID;

@Service
public class ConsumerOperation implements ConsumerService {

    @Autowired
    private MessageService persistenceService;

    @Override
    public void read(MessageResponse messageResponse) {
        Message entity;
        entity = ObjectMapper.map(messageResponse, Message.class);
        System.err.println("entity "+ entity.toString());
        this.persistenceService.save(entity);
        //Aqui hay que suscribirse
    }

    @Override
    public Flux<Message> findAll() {
        return persistenceService.findAll();
    }
}
