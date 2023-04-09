package com.baam.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class PamyentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PamyentApplication.class, args);
	}

}
