package com.garood.rabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    @RabbitListener(queues="${rabbitmq.queueName}")
    public void consume(String message){
        System.out.println(message);
        System.out.println(String.format("Consumer listen the message as {}", message));
    }
}
