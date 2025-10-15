package com.kafka.message_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageProducerApplication {

	public static void main(String[] args) {

        System.out.println("Producer running");
		SpringApplication.run(MessageProducerApplication.class, args);
	}

}
