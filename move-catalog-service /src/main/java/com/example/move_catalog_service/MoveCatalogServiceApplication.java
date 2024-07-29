package com.example.move_catalog_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MoveCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoveCatalogServiceApplication.class, args);
	}

}
