package com.tlc.demo.consumer.consumerservice.service;

import com.tlc.demo.consumer.consumerservice.entity.Message;
import com.tlc.demo.consumer.consumerservice.repository.MessageRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
@Log4j2
public class MessageOperation implements MessageService {

    @Autowired
    private MessageRepository repo;

    @Override
    public Mono<Message> save(Message message) {

        return this.repo.save(message);
    }

    @Override
    public Flux<Message> findAll() {
        return this.repo.findAll();
    }
}
