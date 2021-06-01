package com.study.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {

    private static final String QUEUE = "queue";

    @Bean
    public Queue queue(){
        return QueueBuilder.durable(QUEUE).build();
    }
}
