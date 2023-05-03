package aop.spring.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import aop.spring.example.LogExecutionTime;
import aop.spring.example.LogExecutionTimeAspectAnnotation;

@RestController
@EnableAutoConfiguration
public class AOPExampleController {
	
	static Logger logger = LoggerFactory.getLogger(LogExecutionTimeAspectAnnotation.class);
	
	@LogExecutionTime
	@GetMapping("/method1")
	public ResponseEntity<String> method1() {
		logger.info("/////// Inside method1() method");
	    return ResponseEntity.ok().body("OK");
	}
	
	@GetMapping("/method2")
	public  ResponseEntity<String> method2() {
		logger.info("/////// Inside method2() method");
		 return ResponseEntity.ok().body("OK");
		
	}
	

	@GetMapping("/method3")
	public   ResponseEntity<String> method3() {
		logger.info("/////// Inside method3() method");
		 return ResponseEntity.ok().body("OK");
		
	}


}
