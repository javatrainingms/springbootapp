package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentControllerAdvaice {

	@ExceptionHandler(StudentNotAvaibelinDatabase.class)
	public ResponseEntity<Object> getExceptionhadnler()
	{
		return new ResponseEntity<Object>("Student id not avaible in Database",HttpStatus.NOT_FOUND);
	}
}
