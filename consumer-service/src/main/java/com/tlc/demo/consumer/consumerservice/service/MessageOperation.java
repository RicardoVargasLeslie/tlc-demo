package com.tlc.demo.consumer.consumerservice.service;

import com.tlc.demo.consumer.consumerservice.entity.Message;
import com.tlc.demo.consumer.consumerservice.repoaitoy.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class MessageOperation implements MessageService {

    @Autowired
    private MessageRepository repo;

    @Override
    public Mono save(Message message) {
        return repo.save(message);
    }
}
