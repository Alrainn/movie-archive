package com.melihawci.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = {"com.melihawci"})
@EnableJpaRepositories(basePackages = {"com.melihawci"})
@EntityScan(basePackages = {"com.melihawci"})
@SpringBootApplication
public class MovieArchiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieArchiveApplication.class, args);
	}

}
