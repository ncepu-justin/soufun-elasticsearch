package com.ncepu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*@EnableAutoConfiguration(exclude = {
		org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class
})*/
@SpringBootApplication
public class SoufunApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoufunApplication.class, args);
	}
}
