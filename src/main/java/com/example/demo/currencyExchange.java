package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class currencyExchange {

	public static void main(String[] args) {
		SpringApplication.run(currencyExchange.class, args);

	}
}

//run instances of one micro service is--> run as vm arguments name = currencyExchange8084 and VM arguments: -Dserver.port=8084
