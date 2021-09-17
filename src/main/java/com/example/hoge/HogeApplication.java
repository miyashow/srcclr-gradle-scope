package com.example.hoge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class HogeApplication {

	WebClient _test;

	public static void main(String[] args) {
		SpringApplication.run(HogeApplication.class, args);
	}

}
