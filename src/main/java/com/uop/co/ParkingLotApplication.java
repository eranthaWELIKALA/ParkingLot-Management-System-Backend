package com.uop.co;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.uop.co.repositories")
@SpringBootApplication// extends ServletInitializer
public class ParkingLotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingLotApplication.class, args);
	}

}
