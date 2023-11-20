package com.pizzeria.hornito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AppPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppPizzaApplication.class, args);
		System.out.println("Terminó la carga.");
	}

}
