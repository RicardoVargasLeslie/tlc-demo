package com.tlc.demo.producer.producerservice.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tlc")
public class MessageController {

    @PostMapping("/message")
    public void send(){


    }


}
