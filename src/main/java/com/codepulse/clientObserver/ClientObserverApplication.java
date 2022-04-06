package com.codepulse.clientObserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ClientObserverApplication {

	public static void main(String[] args) {

		SpringApplication.run(ClientObserverApplication.class, args);

		log.info("ClientObserverApplication is started.");
	}
}
