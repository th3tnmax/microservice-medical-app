package com.example.etablissementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.etablissementservice.repositories")
public class EtablissementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtablissementServiceApplication.class, args);
	}

}
