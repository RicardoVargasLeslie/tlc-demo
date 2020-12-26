package com.tlc.demo.consumer.consumerservice;

import com.tlc.demo.consumer.consumerservice.repository.MessageRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import reactor.core.publisher.Mono;


@Log4j2
@EnableReactiveMongoRepositories
@SpringBootApplication
public class ConsumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerServiceApplication.class, args);
	}

}
