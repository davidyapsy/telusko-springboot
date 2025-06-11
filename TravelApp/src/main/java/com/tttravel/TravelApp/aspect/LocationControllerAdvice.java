package com.tttravel.TravelApp.aspect;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tttravel.TravelApp.exceptions.ResourceNotFoundException;

@RestControllerAdvice
public class LocationControllerAdvice {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleLocationNotFoundException(ResourceNotFoundException rnfe){
		ErrorDetails ed = new ErrorDetails(rnfe.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ErrorDetails> (ed, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleException(Exception e){
		ErrorDetails ed = new ErrorDetails(e.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ErrorDetails> (ed, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
