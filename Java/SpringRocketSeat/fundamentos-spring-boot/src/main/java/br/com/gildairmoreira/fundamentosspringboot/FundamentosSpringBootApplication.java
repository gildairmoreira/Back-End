package br.com.gildairmoreira.fundamentosspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.gildairmoreira")
public class FundamentosSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundamentosSpringBootApplication.class, args);
	}

}
