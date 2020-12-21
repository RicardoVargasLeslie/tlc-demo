package com.tlc.demo.producer.producerservice.rest;

import com.tlc.demo.producer.producerservice.request.MessageRequest;
import com.tlc.demo.producer.producerservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tlc/v1")
public class MessageController {

    @Autowired
    private MessageService service;

    @PostMapping("/message")
    public void send(@RequestBody MessageRequest request){
        this.service.send(request);
    }
}
