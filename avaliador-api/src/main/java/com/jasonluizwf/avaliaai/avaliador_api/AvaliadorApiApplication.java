package com.jasonluizwf.avaliaai.avaliador_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jasonluizwf.avaliaai")
public class AvaliadorApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvaliadorApiApplication.class, args);
	}
}
