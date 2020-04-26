package com.garood.rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "rabbitmq")
public class MQProducer {

    @Value("${rabbitmq.queueName}")
    String queueName;

    @Value("${rabbitmq.template.exchange}")
    String exchange;

    @Value("${rabbitmq.template.routing-key}")
    private String routingkey;

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String message) {

        amqpTemplate.convertAndSend(exchange,routingkey,message);

    }


}
