package com.example.messagereceiver;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class MessageReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageReceiverApplication.class, args);
	}

}
