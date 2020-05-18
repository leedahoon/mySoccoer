package com.mySoccer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping(value = "/")
	public String home() {
		return "welcome Home";
	}
	
}
