package com.telidu.advice;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.telidu.exception.TouristNotFoundException;

@RestControllerAdvice
public class TouristControllerAdvice {
	@ExceptionHandler(TouristNotFoundException.class)
	ResponseEntity<ErrorDetails> handleTouristException(TouristNotFoundException tnf){
		ErrorDetails err=new ErrorDetails(tnf.getMessage(),LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
}
