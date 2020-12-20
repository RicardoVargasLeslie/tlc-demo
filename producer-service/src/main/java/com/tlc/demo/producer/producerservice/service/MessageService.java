package com.tlc.demo.producer.producerservice.service;

import com.tlc.demo.producer.producerservice.request.MessageRequest;
import org.springframework.stereotype.Service;

@Service
public interface MessageService {
    void send(MessageRequest request);
}
