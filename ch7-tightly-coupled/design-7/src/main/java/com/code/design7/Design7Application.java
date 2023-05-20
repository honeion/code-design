package com.code.design7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Design7Application {

	public static void main(String[] args) {
		SpringApplication.run(Design7Application.class, args);
	}

}
