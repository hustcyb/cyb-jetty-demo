package com.cyb.jetty.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${value}")
	private String value;

	@GetMapping("/")
	public String home() {
		return "Hello, World!";
	}

	@GetMapping("value")
	public String value() {
		return value;
	}
}
