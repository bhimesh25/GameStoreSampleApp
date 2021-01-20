package com.favourite.gamers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.favourite.gamers")
public class GamersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamersServiceApplication.class, args);
	}

}
