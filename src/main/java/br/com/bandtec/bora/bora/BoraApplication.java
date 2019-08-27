package br.com.bandtec.bora.bora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"br.com.bandtec.bora.model"})   //esse cara define onde ficam as entidades que serão criadas automaticamente no banco
public class BoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoraApplication.class, args);
		
	}

}
