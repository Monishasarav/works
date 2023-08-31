package com.myapp.works;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Works {
	@GetMapping(value="/works")
	public String display(){
		return "works";
	}	

}
