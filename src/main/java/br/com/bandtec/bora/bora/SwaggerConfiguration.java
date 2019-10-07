package br.com.bandtec.bora.bora;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.bandtec.bora.model.entity.Usuario;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {

	@Bean
	public Docket boraApi() {
		return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.bandtec.bora"))
                .paths(PathSelectors.ant("/**"))
                .build();
                //.ignoredParameterTypes(Usuario.class);
               
		
	}
}
