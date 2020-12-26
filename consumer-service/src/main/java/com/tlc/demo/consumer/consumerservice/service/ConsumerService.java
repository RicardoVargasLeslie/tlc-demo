package com.tlc.demo.consumer.consumerservice.service;

import com.tlc.demo.consumer.consumerservice.entity.Message;
import com.tlc.demo.consumer.consumerservice.request.MessageRequest;
import com.tlc.demo.consumer.consumerservice.response.MessageResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ConsumerService {
    void read(MessageRequest messageResponse);
    Flux<MessageResponse> findAll();
}
