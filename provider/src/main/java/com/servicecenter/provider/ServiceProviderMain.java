package com.servicecenter.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.servicecenter.provider.model.ServiceItem;
@EnableEurekaClient
@SpringBootApplication
public class ServiceProviderMain {
	public static void main(String args[]) {
		SpringApplication.run(ServiceProviderMain.class, args);		
		
	}
	
}
