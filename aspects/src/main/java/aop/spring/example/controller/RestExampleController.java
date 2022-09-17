package aop.spring.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import aop.spring.example.LogExecutionTime;
import aop.spring.example.LogExecutionTimeAspectAnnotation;

@RestController
@EnableAutoConfiguration
public class RestExampleController {
	
	static Logger logger = LoggerFactory.getLogger(LogExecutionTimeAspectAnnotation.class);
	
	@LogExecutionTime
	@GetMapping("/method1")
	public void method1() {
		logger.info("/////// Inside method1() method");
		
	}
	
	@GetMapping("/method2")
	public void method2() {
		logger.info("/////// Inside method2() method");
		
	}


}
