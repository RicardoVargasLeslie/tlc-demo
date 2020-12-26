package com.tlc.demo.consumer.consumerservice.service;

import com.tlc.demo.consumer.consumerservice.entity.Message;
import com.tlc.demo.consumer.consumerservice.response.MessageResponse;
import reactor.core.publisher.Flux;

public interface ConsumerService {
    void read(MessageResponse messageResponse);
    Flux<Message> findAll();
}
