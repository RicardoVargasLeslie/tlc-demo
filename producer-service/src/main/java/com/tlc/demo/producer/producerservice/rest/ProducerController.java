package com.tlc.demo.producer.producerservice.rest;

import com.tlc.demo.producer.producerservice.request.MessageRequest;
import com.tlc.demo.producer.producerservice.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tlc/v1")
public class ProducerController {

    @Autowired
    private ProducerService service;

    @PostMapping("/message")
    public void send(@RequestBody MessageRequest request){
        this.service.send(request);
    }
}
