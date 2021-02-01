package com.shift.payservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Shameera.A on 1/22/2021
 */

@RestController
@RequestMapping("/products")
public class TestController {

	@GetMapping
	public ResponseEntity<String> getProducts() {
		return ResponseEntity.ok().body("--  Product List ---");
	}
}
