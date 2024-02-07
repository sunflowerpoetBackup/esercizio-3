package com.example.esercizio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class NameController {

	@GetMapping("/name")
	public String getName(@RequestParam String name) {
		return name;
	}

	@PostMapping("/reverseName")
	public String reverseName(@RequestParam String name) {
		return new StringBuilder(name).reverse().toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(NameController.class, args);
	}
}
