package com.RegistroApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication(scanBasePackages = {
	    "com.RegistroApp",
	    "com.RegistroApp.Controller"
	})
	@EntityScan("com.RegistroApp")
	@EnableJpaRepositories("com.RegistroApp.repository")

public class RegistroAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroAppApplication.class, args);
	}

}
