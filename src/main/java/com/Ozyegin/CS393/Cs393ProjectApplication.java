package com.Ozyegin.CS393;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Date;

@SpringBootApplication
public class Cs393ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cs393ProjectApplication.class, args);
	}
}