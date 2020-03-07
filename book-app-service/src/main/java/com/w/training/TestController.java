package com.w.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	TestService service;

	
	@RequestMapping("/app")
	String getData() {
		
		return service.getData();
	}
	
}
