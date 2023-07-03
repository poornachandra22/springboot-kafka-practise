package com.example.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic kafkaPractiseTopic(){
        return TopicBuilder.name("kafkaPractise").build();
    }
    @Bean
    public NewTopic kafkaPractiseJsonTopic(){
        return TopicBuilder.name("kafkaPractiseJson").build();
    }
}
