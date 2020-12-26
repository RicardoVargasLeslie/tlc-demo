package com.tlc.demo.producer.producerservice.service;

import com.tlc.demo.producer.producerservice.request.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerBroker implements ProducerService {
    
    private static final String TOPIC="tlc";
    private final KafkaTemplate template;

    public ProducerBroker(KafkaTemplate template) {
        this.template = template;
    }

    @Override
    public String send(MessageRequest request) {
        this.template.send(TOPIC,request);
        return "JSON Published!";
    }
}
