package com.prakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudDcDeptAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDcDeptAppApplication.class, args);
	}

}
