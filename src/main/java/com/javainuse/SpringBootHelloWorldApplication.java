package com.javainuse;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("Helooo Rajani");
		System.out.println("Hi");
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
}
