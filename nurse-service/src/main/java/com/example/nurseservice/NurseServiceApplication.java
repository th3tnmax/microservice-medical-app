package com.example.nurseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.nurseservice.repositories")
@EnableFeignClients
public class NurseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NurseServiceApplication.class, args);
	}

}
