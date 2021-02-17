package com.invi.marsrover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.invi.marsrover")
@SpringBootApplication
public class MarsRoverApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarsRoverApiApplication.class, args);
	}
 
}
