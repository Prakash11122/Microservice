package com.prakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudDcEmpAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDcEmpAppApplication.class, args);
	}

}
