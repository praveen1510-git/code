package com.tech.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechController {
	
	@GetMapping(value= "/micro")
	public List<String> str(){
		List<String> k  = new ArrayList<>();
		k.add("keyboard");
		k.add("motherboard");
		k.add("mouse");
		k.add("cpu");
		k.add("display");
		
		return k;
	}

}
