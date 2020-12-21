package com.tlc.demo.consumer.consumerservice.service;


import com.tlc.demo.consumer.consumerservice.entity.Message;
import reactor.core.publisher.Mono;

public interface MessageService {

    Mono save(Message message);
}
