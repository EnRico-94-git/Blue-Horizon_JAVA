package com.example.BlueHorizonJAVA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
public class BlueHorizonJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueHorizonJavaApplication.class, args);
	}

	@Configuration
	@EnableSwagger2
	public class SwaggerConfig {

	    @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.example.sustainablefishing.controller"))
	                .paths(PathSelectors.any())
	                .build();
	    }
	}
	
}
