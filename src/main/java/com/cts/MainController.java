package com.cts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	@GetMapping("/") // localhost:9090/
	public String home() {
		return "<h1>Welcome to Spring Security</h1>";
	}
	
	
	@GetMapping("/user")
	public String user() {
		return "<h2>Welcome User!!";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h2>Welcome Admin!!";
	}
	
}
