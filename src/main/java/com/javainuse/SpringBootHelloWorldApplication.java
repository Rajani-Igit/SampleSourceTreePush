package com.javainuse;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("I am Lilima");
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
}
