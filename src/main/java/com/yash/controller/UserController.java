package com.yash.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class UserController {
	
	@GetMapping("/")
	public ResponseEntity<String> registerUser(){
		
		return new  ResponseEntity<String>("User Register Succesfully",HttpStatus.OK);
				
		
	}

}
