package com.sesame.Dockerex1application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Dockerex1applicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(Dockerex1applicationApplication.class, args);
	}

	@GetMapping("/test")
	public String hello() {return "Hello World";}
}
