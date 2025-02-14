package com.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuizSerivceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizSerivceApplication.class, args);
	}

}
