package com.tlc.demo.consumer.consumerservice.service;

import com.tlc.demo.consumer.consumerservice.entity.Message;
import com.tlc.demo.consumer.consumerservice.repository.MessageRepository;
import com.tlc.demo.consumer.consumerservice.response.MessageResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Log4j2
public class MessageOperation implements MessageService {

    @Autowired
    private MessageRepository repository;

    @Override
    public Mono<MessageResponse> save(final Message message) {



        Mono<Message> savedMessages = Mono.just(message).flatMap(this.repository::save);
        repository.deleteAll().thenMany(savedMessages);
        Mono<MessageResponse> responseMessage = savedMessages
                .map( item -> new MessageResponse(item.getName()));

        return responseMessage;
    }

    @Override
    public Flux<MessageResponse> findAll() {

        Flux<MessageResponse> messages = repository.findAll()
                .map( item -> new MessageResponse(item.getName()));
        return messages;
    }
}
