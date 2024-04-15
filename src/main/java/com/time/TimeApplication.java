package com.time;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class TimeApplication {

	static Logger log  =  Logger.getLogger(TimeApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TimeApplication.class, args);
		
		PropertyConfigurator.configure("log.properties");
		log.info("Information");
		log.warn("Warning");
		log.error("Error");
		log.debug("Debugging");
		log.fatal("fatal");
	}

}
