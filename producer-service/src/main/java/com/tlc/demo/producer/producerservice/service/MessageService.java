package com.tlc.demo.producer.producerservice.service;

import com.tlc.demo.producer.producerservice.request.MessageRequest;

public interface MessageService {
    String send(MessageRequest request);
}
