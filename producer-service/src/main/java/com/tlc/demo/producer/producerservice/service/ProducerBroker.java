package com.tlc.demo.producer.producerservice.service;

import com.tlc.demo.producer.producerservice.request.MessageTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerBroker implements ProducerService {
    

    private final KafkaTemplate<String, MessageTest> template;

    public ProducerBroker(KafkaTemplate template) {
        this.template = template;
    }

    @Override
    public String send(MessageTest request, String topic) {
        this.template.send(topic,request);
        return "JSON Published!";
    }
}
