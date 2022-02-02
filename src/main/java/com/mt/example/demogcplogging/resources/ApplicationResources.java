package com.mt.example.demogcplogging.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class ApplicationResources {

	@RequestMapping("/logging")
	public ResponseEntity<String> gcpLoggingDemo() {
		log.info("This log should appear in google cloud");
		return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
	}
	
}
