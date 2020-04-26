package com.garood.rabbitmq.controller;

import com.garood.rabbitmq.service.MQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class RabbitMQProducerController {

    @Autowired
    private MQProducer producer;

    @GetMapping("produce/{message}")
    public String produceInformation(@PathVariable String message){
        producer.send(message);
        return "Successfully enqueue the message " + message;
    }
}
