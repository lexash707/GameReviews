package com.example.game.gameservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.example.game.gameservice.model")
@SpringBootApplication
public class GameServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameServiceApplication.class, args);
	}

}
