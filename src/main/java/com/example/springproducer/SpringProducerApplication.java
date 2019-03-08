package com.example.springproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example")
public class SpringProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProducerApplication.class, args);
	}

}
