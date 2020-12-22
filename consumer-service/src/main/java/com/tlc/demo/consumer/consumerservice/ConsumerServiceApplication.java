package com.tlc.demo.consumer.consumerservice;

import com.tlc.demo.consumer.consumerservice.repository.MessageRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import reactor.core.publisher.Mono;

@SpringBootApplication
@Log4j2
@EnableReactiveMongoRepositories
public class ConsumerServiceApplication  implements  CommandLineRunner {

	@Autowired
	private MessageRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ConsumerServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll().subscribe();
		Mono<Long> l=repository.count();

		l.subscribe(e->{
			System.err.println(e.toString());
		});

		/**
		repository.deleteAll().subscribe(null,null,() -> Stream.of(
				new Message(UUID.randomUUID(),
				"Peter"),new Message(UUID.randomUUID(),
				"Sam"),new Message(UUID.randomUUID(),
				"Ryan"),new Message(UUID.randomUUID(),
				"Chris")
		).forEach(item -> {
			repository.save(item).subscribe(System.out::println);
		}));
       **/
	}
}
