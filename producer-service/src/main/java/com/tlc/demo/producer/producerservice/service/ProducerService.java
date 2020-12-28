package com.tlc.demo.producer.producerservice.service;

import com.tlc.demo.producer.producerservice.request.MessageTest;

public interface ProducerService {
    String send(MessageTest request, String topic);
}
