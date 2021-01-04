package com.tlc.demo.consumer.consumerservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.UUID;


@Document(collection = "message")
@NoArgsConstructor
@Data
public class Message  {

    @Id
    @JsonIgnore
    private UUID id=UUID.randomUUID();
    private String name;

    public Message(String name) {
        this.name = name;
    }
}