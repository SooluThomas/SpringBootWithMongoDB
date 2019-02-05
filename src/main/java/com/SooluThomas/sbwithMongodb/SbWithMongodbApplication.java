package com.SooluThomas.sbwithMongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SbWithMongodbApplication {

	@Autowired

	public static void main(String[] args) {
		SpringApplication.run(SbWithMongodbApplication.class, args);
	}

}

