package com.spoorthi.api.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpoorthiApiController {

	@GetMapping(value = "/test")
	public String test() {
		return "spoorthi application executed successfully";
	}
	
	@PostMapping(value="/test1", produces=MediaType.APPLICATION_JSON_VALUE)
	public String test1(@RequestBody String j, Integer i) {
		return "Spoorthi";
	}

}
