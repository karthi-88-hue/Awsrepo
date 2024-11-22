package com.Aws3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aws3Controller {

	@GetMapping(value="/Aws")
	
	public String dockeraws() {
		return "Life will Favour You";
	}
	
}
