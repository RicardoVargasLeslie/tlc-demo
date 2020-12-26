package com.tlc.demo.producer.producerservice.rest;

import com.tlc.demo.producer.producerservice.request.MessageRequest;
import com.tlc.demo.producer.producerservice.response.KafkaResponse;
import com.tlc.demo.producer.producerservice.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tlc/api/v1")
public class ProducerController {

    @Autowired
    private ProducerService service;

    @PostMapping("/message")
    public KafkaResponse send(@RequestBody final MessageRequest request){
        this.service.send(request);
        return new KafkaResponse();
    }
}
