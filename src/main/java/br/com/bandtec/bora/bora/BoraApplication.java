package br.com.bandtec.bora.bora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"br.com.bandtec.bora.controller"})
@EnableJpaRepositories(basePackages = {"br.com.bandtec.bora.repository"})
@SpringBootApplication
@EntityScan(basePackages = {"br.com.bandtec.bora.model"})   //esse cara define onde ficam as entidades que serão criadas automaticamente no banco
public class BoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoraApplication.class, args);
		
	}

}
