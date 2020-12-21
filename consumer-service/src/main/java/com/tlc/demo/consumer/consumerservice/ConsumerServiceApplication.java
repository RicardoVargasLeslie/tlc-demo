package com.tlc.demo.consumer.consumerservice;

import com.tlc.demo.consumer.consumerservice.entity.Message;
import com.tlc.demo.consumer.consumerservice.repoaitoy.MessageRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

import java.util.UUID;

@SpringBootApplication
@Log4j2
public class ConsumerServiceApplication implements CommandLineRunner {

	@Autowired
	private MessageRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ConsumerServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
	//	repository.save(new Message(UUID.randomUUID(),"Mark"));
	//	repository.save(new Message(UUID.randomUUID(),"Jon"));


		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");


		repository
				.deleteAll()
				.thenMany(
						Flux
								.just("Mark", "Jon", "Luis", "Test")
								.map(name -> new Message(UUID.randomUUID(), name))
								.flatMap(repository::save)
				)
				.thenMany(repository.findAll())
				.subscribe(profile -> log.info("saving " + profile.toString()));

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByName("Mark"));
	}
}
