package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodepipelineAwsApplication {

	@GetMapping("/hello")
	public String hello() {
		return "welcome to codepipeline aws demo";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CodepipelineAwsApplication.class, args);
	}
}
