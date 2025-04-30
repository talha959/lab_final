package com.lab.lab_final;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
//@EnableConfigServer
public class LabFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabFinalApplication.class, args);
	}

}
