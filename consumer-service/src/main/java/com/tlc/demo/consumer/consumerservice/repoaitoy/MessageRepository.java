package com.tlc.demo.consumer.consumerservice.repoaitoy;

import com.tlc.demo.consumer.consumerservice.entity.Message;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface MessageRepository extends ReactiveMongoRepository<Message, UUID> {

     Message findById(String id);
     List<Message> findByName(String name);
}
