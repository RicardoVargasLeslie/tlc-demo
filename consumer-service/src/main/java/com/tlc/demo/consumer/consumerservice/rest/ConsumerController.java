package com.tlc.demo.consumer.consumerservice.rest;

import com.tlc.demo.consumer.consumerservice.response.MessageResponse;
import com.tlc.demo.consumer.consumerservice.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/tlc/v1")
public class ConsumerController {

    @Autowired
    private ConsumerService service;

    public MessageResponse receive(MessageResponse messageResponse) {
        return this.service.receive(messageResponse);
    }
}
