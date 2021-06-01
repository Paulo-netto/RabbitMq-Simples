package com.study.rabbitmq.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduceController {

    private static final String DIRECT_EXCHANGE_DEFAULT = "direct-exchange-default";
    private static final String QUEUE_A_KEY = "queue-a-key";

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public ResponseEntity<?> sendMsg(@RequestBody String msg){
        rabbitTemplate.convertAndSend(DIRECT_EXCHANGE_DEFAULT, QUEUE_A_KEY , msg);
        return ResponseEntity.ok("Msg send to the queue");
    }
}
