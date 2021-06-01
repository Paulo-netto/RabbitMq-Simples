package com.study.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @RabbitListener(queues = "queue")
    public void listener(String msg) {
        System.out.println("Msg received from queue: " + msg);
    }

}
