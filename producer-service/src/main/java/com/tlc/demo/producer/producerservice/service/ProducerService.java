package com.tlc.demo.producer.producerservice.service;

import com.tlc.demo.producer.producerservice.request.MessageRequest;

public interface ProducerService {
    String send(MessageRequest request);
}
