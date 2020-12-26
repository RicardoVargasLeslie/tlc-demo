package com.tlc.demo.consumer.consumerservice.rest;


import com.tlc.demo.consumer.consumerservice.entity.Message;
import com.tlc.demo.consumer.consumerservice.repository.MessageRepository;
import com.tlc.demo.consumer.consumerservice.response.MessageResponse;
import com.tlc.demo.consumer.consumerservice.service.ConsumerService;
import com.tlc.demo.consumer.consumerservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@RestController
@RequestMapping("/tlc/v1")
@EnableKafka
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @KafkaListener(groupId = "id-tlc", topics = "tlc", containerFactory = "kafkaListenerContainerFactory")
    public void read(MessageResponse messageResponse) {
        this.consumerService.read(messageResponse);
    }

    @GetMapping("/messages")
    public Flux<Message> findAll() {
        return this.consumerService.findAll();
    }

    @GetMapping("/adios")
    public String adios() {
        return "adios";
    }
}
