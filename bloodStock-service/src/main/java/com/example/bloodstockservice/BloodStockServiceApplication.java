package com.example.bloodstockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BloodStockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodStockServiceApplication.class, args);
	}

}
