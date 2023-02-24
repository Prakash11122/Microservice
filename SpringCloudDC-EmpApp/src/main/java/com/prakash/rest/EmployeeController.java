package com.prakash.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@GetMapping("/show")
	public ResponseEntity<String> showMsg(){
		return ResponseEntity.ok("FROM EMPLOYEE SERVICE!!");
		
	}
	

}
