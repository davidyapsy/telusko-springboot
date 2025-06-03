package com.telusko.currConverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Currency Conversion API",
				version = "v1.0",
				description = "This API helps to convert currency rate by entering the favourite countries."),
		servers = @Server(
				url = "http://localhost:6969/currconverterapp",
				description = "This contains server info")
		)
public class CurrConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrConverterApplication.class, args);
	}

}
