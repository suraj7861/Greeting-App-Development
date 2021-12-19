package com.bridgelabz.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingAppApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to greeting app");
		SpringApplication.run(GreetingAppApplication.class, args);
	}

}
