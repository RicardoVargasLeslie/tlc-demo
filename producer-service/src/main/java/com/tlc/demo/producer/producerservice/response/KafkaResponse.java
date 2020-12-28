package com.tlc.demo.producer.producerservice.response;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class KafkaResponse implements Serializable {
    private final String message ="Message sent to Kafka";
    private final LocalDateTime current = LocalDateTime.now();
}
