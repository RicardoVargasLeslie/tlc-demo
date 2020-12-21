package com.tlc.demo.consumer.consumerservice.config;

import com.tlc.demo.consumer.consumerservice.response.MessageResponse;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableKafka
public class KafkaConfig {

    private static final String LOCALHOST="localhost:9092";
    private static final String ID="id-tlc";

    @Bean
    public ConsumerFactory<String,MessageResponse> consumerFactory() {
         Map<String,Object> configMap = new HashMap<>();
         configMap.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,LOCALHOST);
         configMap.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
         configMap.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonSerializer.class);
         configMap.put(ConsumerConfig.GROUP_ID_CONFIG,ID);
         return new DefaultKafkaConsumerFactory(configMap,new StringDeserializer(),new JsonDeserializer<>(MessageResponse.class));
    }

    public ConcurrentKafkaListenerContainerFactory<String,MessageResponse> kafkaListenerContainerFactory() {

         ConcurrentKafkaListenerContainerFactory <String,MessageResponse> factory
                = new ConcurrentKafkaListenerContainerFactory<>();
         factory.setConsumerFactory(this.consumerFactory());
         return factory;
    }
}
