package com.tlc.demo.producer.producerservice.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class KafkaResponse {
    private final String message ="Message sent to Kafka";
    private  final LocalDate current=LocalDate.now();
}
