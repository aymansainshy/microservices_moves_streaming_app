package com.example.move_.streaming_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MoveStreamingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoveStreamingServiceApplication.class, args);
	}

}
