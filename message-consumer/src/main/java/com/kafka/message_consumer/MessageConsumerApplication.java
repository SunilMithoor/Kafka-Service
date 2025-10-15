package com.kafka.message_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageConsumerApplication {

	public static void main(String[] args) {
        System.out.println("Consumer running");
		SpringApplication.run(MessageConsumerApplication.class, args);
	}

}
