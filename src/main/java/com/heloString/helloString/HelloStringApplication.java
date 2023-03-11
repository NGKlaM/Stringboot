package com.heloString.helloString;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloStringApplication {
	public static void main(String[] args) {
		System.out.println("hello work");
		SpringApplication.run(HelloStringApplication.class, args);
	}

}
