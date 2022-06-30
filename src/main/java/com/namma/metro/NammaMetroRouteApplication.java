package com.namma.metro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Arjun Metre
 * 
 */
@SpringBootApplication
@Slf4j
public class NammaMetroRouteApplication {

	public static void main(String[] args) {
		log.info("start server at");
		SpringApplication.run(NammaMetroRouteApplication.class, args);

	}

}
