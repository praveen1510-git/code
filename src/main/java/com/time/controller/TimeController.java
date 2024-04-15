package com.time.controller;

import java.util.List;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.time.entity.TimeEntity;
import com.time.excep.TimeExcep;
import com.time.service.TimeService;

@RestController
public class TimeController {
	
	@Autowired
	TimeService ts;
	
	 static Logger log  =  Logger.getLogger(TimeController.class);
	 
	 
	@PostMapping(value= "/post")
	public String post100(@RequestBody List<TimeEntity> a) {
		PropertyConfigurator.configure("log.properties");
		log.info(ts.post100(a));
		return ts.post100(a);
	}
	
	@GetMapping(value = "/get")
	public List<TimeEntity> get100(){
		return ts.get100();
	}
	
	@GetMapping(value = "/excep")
	public int excep100() throws Exception {
		throw new TimeExcep("check data");
		
		
	}

}
