package com.tlc.demo.producer.producerservice.rest;

import com.tlc.demo.producer.producerservice.request.MessageRequest;
import com.tlc.demo.producer.producerservice.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tlc/v1")
public class ProducerController {

    @Autowired
    private ProducerService service;

    @PostMapping("/message")
    public String send(@RequestBody MessageRequest request){
        this.service.send(request);
        return "Message sent to Kafka";
    }

    @GetMapping("/hola")
    public String hola(){

        System.err.print("Holaaa dsddsdsds");

        return "LLAMADA DESDE WSO2";
    }
}
