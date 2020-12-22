package com.tlc.demo.consumer.consumerservice.repository;

import com.tlc.demo.consumer.consumerservice.entity.Message;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
@Repository
public interface MessageRepository extends ReactiveMongoRepository<Message, UUID> {

}
