package com.javatpoint.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CrudFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudFeignApplication.class, args);
	}

}
