package com.tlc.demo.consumer.consumerservice.service;


import com.tlc.demo.consumer.consumerservice.entity.Message;
import com.tlc.demo.consumer.consumerservice.mapper.ObjectMapper;
import com.tlc.demo.consumer.consumerservice.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsumerBroker implements ConsumerService {

    @Autowired
    private MessageService service;

    @Override
    @KafkaListener(groupId = "id-tlc", topics = "tlc", containerFactory = "kafkaListenerContainerFactory")
    public MessageResponse receive(MessageResponse messageResponse) {

        Message entity = new Message();
        entity.setId(UUID.randomUUID());
        entity = ObjectMapper.map(messageResponse, Message.class);
        System.err.println("IN LISTENER"+ messageResponse.toString());

        this.service.save(entity);

        return messageResponse;
    }
}
