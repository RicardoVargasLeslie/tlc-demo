package com.tlc.demo.producer.producerservice.rest;

import com.tlc.demo.producer.producerservice.request.MessageRequest;
import com.tlc.demo.producer.producerservice.response.KafkaResponse;
import com.tlc.demo.producer.producerservice.service.ProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tlc/api/v1")
public class ProducerController {


    private final ProducerService service;

    public ProducerController(ProducerService service) {
        this.service = service;
    }

    @PostMapping("/message")
    public KafkaResponse send(@RequestBody final MessageRequest request){
        this.service.send(request);
        return new KafkaResponse();
    }
}
