package com.shil.activiti001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = { org.activiti.spring.boot.SecurityAutoConfiguration.class })
public class Activiti001Application {

	public static void main(String[] args) {
		SpringApplication.run(Activiti001Application.class, args);
	}

}
