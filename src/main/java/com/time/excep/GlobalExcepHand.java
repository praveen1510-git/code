package com.time.excep;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalExcepHand {
	

	@ExceptionHandler(value = TimeExcep.class)
	public ResponseEntity<Object> nameEx(TimeExcep na){
		return new ResponseEntity<>(na.getMessage(),HttpStatus.NON_AUTHORITATIVE_INFORMATION);
	}

}
