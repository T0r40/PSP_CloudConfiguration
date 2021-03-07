package com.iesvi.sccs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SccsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SccsApplication.class, args);
	}

}
