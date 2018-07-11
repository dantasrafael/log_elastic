package br.com.rafaeldantas.log_elastic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogElasticApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(LogElasticApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LogElasticApplication.class, args);
		logger.info("Diretório atual= " + System.getProperty("user.dir"));
		logger.info("teste para um log INFO");
		logger.warn("teste para um log WARN");
		logger.error("teste para um log ERROR");
	}
}
