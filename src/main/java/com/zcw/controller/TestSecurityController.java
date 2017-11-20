package com.zcw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSecurityController {

	@GetMapping("/test")
	public String securityInterface() {
		return "success";
	}

	@GetMapping("/getInfo")
	public String getInfo() {
		return "getInfo";
	}

	@PostMapping("/c_login")
	public String login() {
		return "login success";
	}
}
