package com.challenge.cubistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CubisticApplication {

	public static void main(String[] args) {
		SpringApplication.run(CubisticApplication.class, args);
	}

}
