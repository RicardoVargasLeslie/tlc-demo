package com.tlc.demo.consumer.consumerservice.rest;



import com.tlc.demo.consumer.consumerservice.request.MessageRequest;
import com.tlc.demo.consumer.consumerservice.response.MessageResponse;
import com.tlc.demo.consumer.consumerservice.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@RestController
@RequestMapping("/tlc/api/v1")
@EnableKafka
public class ConsumerController {

    @Autowired
    private final ConsumerService consumerService;

    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @KafkaListener(groupId = "id-tlc", topics = "tlc", containerFactory = "kafkaListenerContainerFactory")
    private void read(final MessageRequest messageRequest) {
        this.consumerService.read(messageRequest);
    }

    @GetMapping("/messages")
    public Flux<MessageResponse> findAll() {
        return this.consumerService.findAll();
    }

    @GetMapping("/adios")
    public String adios() {
        return "adios";
    }
}
