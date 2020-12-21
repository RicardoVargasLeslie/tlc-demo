package com.tlc.demo.consumer.consumerservice.service;

import com.tlc.demo.consumer.consumerservice.response.MessageResponse;

public interface ConsumerService {
    MessageResponse receive(MessageResponse messageResponse);
}
