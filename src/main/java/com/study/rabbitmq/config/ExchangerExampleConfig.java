package com.study.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ExchangerExampleConfig {

    private static final String DIRECT_EXCHANGE_DEFAULT = "direct-exchange-default";
    private static final String QUEUE_A_KEY = "queue-a-key" ;

    @Autowired
    private Queue queue;

    @Bean
    public Exchange directExchange() {
        return ExchangeBuilder.directExchange(DIRECT_EXCHANGE_DEFAULT).build();
    }
    @Bean
    public Binding bindingQueue(){
        return BindingBuilder.bind(queue).to(directExchange()).with(QUEUE_A_KEY).noargs();
    }

}
