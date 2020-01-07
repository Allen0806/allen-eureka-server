package com.allen.spring.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AllenEurakaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllenEurakaServerApplication.class, args);
	}

}
