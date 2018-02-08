package com.hello.Hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class HelloApplication{

	
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
	
}
