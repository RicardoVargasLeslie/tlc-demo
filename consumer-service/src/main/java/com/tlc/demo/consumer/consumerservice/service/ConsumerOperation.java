package com.tlc.demo.consumer.consumerservice.service;


import com.tlc.demo.consumer.consumerservice.entity.Message;
import com.tlc.demo.consumer.consumerservice.mapper.ObjectMapper;
import com.tlc.demo.consumer.consumerservice.request.MessageRequest;
import com.tlc.demo.consumer.consumerservice.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ConsumerOperation implements ConsumerService {

    @Autowired
    private MessageService persistenceService;

    @Override
    public void read(final MessageRequest messageResponse) {
        Mono.just(messageResponse)
                 .map(e -> new Message(e.getName()))
                 .subscribe(data -> persistenceService.save(data));

        //Aqui hay que suscribirse
    }

    @Override
    public Flux<MessageResponse> findAll() {

         return this.persistenceService.findAll();
    }

}
