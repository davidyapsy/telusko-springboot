package com.telusko.TouristBackend.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.telusko.TouristBackend.exceptions.TouristNotFoundException;

@RestControllerAdvice
public class TouristControllerAdvice {

	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTNFException(TouristNotFoundException tnf){
		ErrorDetails details = new ErrorDetails(tnf.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ErrorDetails> (details, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleException(Exception e){
		ErrorDetails details = new ErrorDetails(e.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ErrorDetails> (details, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
