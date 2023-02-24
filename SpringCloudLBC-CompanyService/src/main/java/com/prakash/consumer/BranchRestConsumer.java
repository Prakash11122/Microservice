package com.prakash.consumer;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BranchRestConsumer {
	
	@Autowired
	private LoadBalancerClient client;
	
	public String GetBranchInfo() {
		//get SI details from Eureka  using serviceId
		ServiceInstance si = client.choose("BRANCH-SERVICE");
		
		//read uri and add path
		URI uri = si.getUri();
		String url = uri + "/branch/info";
		//Make HTTP call
		RestTemplate rt =new RestTemplate();
		ResponseEntity<String> resp = rt.getForEntity(url, String.class);
		//return response body 
		return resp.getBody();
	}

}
