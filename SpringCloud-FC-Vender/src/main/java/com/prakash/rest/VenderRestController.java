package com.prakash.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor")
public class VenderRestController {
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/msg")
	public ResponseEntity<String> showMsg(){
		return ResponseEntity.ok("WELCOME TO VENDOR!!" + port);
	}

}
