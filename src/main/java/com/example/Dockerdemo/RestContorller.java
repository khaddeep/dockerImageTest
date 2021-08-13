package com.example.Dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class RestContorller {

	@GetMapping("/list")
	public Employee getEmployees() {

		return new Employee(1, "Deepson", "Khadka");
	}
	
}
