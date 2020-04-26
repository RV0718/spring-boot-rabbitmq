package com.garood.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.garood.rabbitmq")
public class RabbitMqProducerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqProducerAppApplication.class, args);
	}

}
