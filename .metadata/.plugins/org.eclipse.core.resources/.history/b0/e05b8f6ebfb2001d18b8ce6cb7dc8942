package com.prakash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.consumer.BranchRestConsumer;

@RestController
@RequestMapping("/company")
public class CompanyRestController {
	@Autowired
	private BranchRestConsumer consumer;
	
	@GetMapping("/details")
	public ResponseEntity<String> viewMsg(){
		String body = "FROM COMPANY" + consumer.GetBranchInfo();
		return ResponseEntity.ok(body);
	}

}
