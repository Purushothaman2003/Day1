package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class welcome {
	@GetMapping("/hello")
	public String Welcome()
	{
		return "welcome! ";
	}

}
 