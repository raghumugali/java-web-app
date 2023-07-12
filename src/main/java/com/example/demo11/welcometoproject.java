package com.example.demo11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcometoproject {
	@GetMapping("/Welcome")
	public String SpringSterter() {
	return "welcome to the project"	;
	}

}
