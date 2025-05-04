package com.example.Jenkins_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);

		System.out.println("Hello Jenkins (another test print)");
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
