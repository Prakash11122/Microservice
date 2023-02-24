package com.prakash.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("VENDER-SERVICE")
public interface VenderRestConsumer {
	
	@GetMapping("/vendor/msg")
	public ResponseEntity<String> showMsg();

}
