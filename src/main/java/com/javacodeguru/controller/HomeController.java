package com.javacodeguru.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	public String home() {
		return "Welcome to CMS !!! "+new Date();
	}
}
