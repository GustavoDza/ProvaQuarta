package br.com.fiap.provaquarta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.fiap.provaquarta.controllers"})
public class ProvaQuartaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaQuartaApplication.class, args);
	}

}
