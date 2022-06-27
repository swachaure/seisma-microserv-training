package com.example.microtask1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Microtask1Application {

	public static void main(String[] args) {
		SpringApplication.run(Microtask1Application.class, args);
	}
}
