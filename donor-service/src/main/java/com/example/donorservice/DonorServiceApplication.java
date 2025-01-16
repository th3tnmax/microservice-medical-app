package com.example.donorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.donorservice.repository")

public class DonorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonorServiceApplication.class, args);
	}

}
