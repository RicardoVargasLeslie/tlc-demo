package com.tlc.demo.consumer.consumerservice.service;

import com.tlc.demo.consumer.consumerservice.response.MessageResponse;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerBroker implements ConsumerService {

    @Override
    @KafkaListener(groupId = "id-tlc", topics = "tlc", containerFactory = "kafkaListenerContainerFactory")
    public MessageResponse receive(MessageResponse messageResponse) {
        System.err.println("IN LISTENER"+ messageResponse.toString());

        return messageResponse;
    }
}
