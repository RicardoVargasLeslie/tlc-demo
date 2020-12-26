package com.tlc.demo.consumer.consumerservice.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.UUID;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "message")
public class Message implements Serializable {

    @Id
    private UUID id=UUID.randomUUID();
    private String name;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
