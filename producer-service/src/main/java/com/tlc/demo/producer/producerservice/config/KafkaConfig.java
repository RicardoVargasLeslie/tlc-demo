package com.tlc.demo.producer.producerservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaConfig {

    public ProducerFactory<String,Object> producerFactory(){
        
    }
}
