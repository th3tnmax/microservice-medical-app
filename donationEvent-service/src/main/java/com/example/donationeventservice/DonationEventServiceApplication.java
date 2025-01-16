package com.example.donationeventservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DonationEventServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonationEventServiceApplication.class, args);
	}

}
