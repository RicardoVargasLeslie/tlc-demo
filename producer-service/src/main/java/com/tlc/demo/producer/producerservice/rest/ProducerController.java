package com.tlc.demo.producer.producerservice.rest;

import com.tlc.demo.producer.producerservice.request.MessageTest;
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
    public KafkaResponse send(@RequestBody final MessageTest request){
        String topic ="tlc";
        System.err.print(request.toString());
        this.service.send(request,topic);
        return new KafkaResponse();
    }
}
