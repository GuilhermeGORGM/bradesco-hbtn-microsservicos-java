package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionService {

	@ExceptionHandler
	public ResponseEntity<UserErrorResponse> handleIdException(UserIdException err) {

		UserErrorResponse uer = new UserErrorResponse(HttpStatus.BAD_REQUEST.value(),
				"You have entered " + err.getMessage() + " invalid.");

		return new ResponseEntity<>(uer, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler
	public ResponseEntity<UserErrorResponse> handleUserNameException(UserNameException err) {

		UserErrorResponse uer = new UserErrorResponse(HttpStatus.BAD_REQUEST.value(),
				"You have entered " + err.getMessage() + " invalid.");

		return new ResponseEntity<>(uer, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler
	public ResponseEntity<UserErrorResponse> handleCPFException(CPFException err) {

		UserErrorResponse uer = new UserErrorResponse(HttpStatus.BAD_REQUEST.value(),
				"You have entered " + err.getMessage() + " invalid.");

		return new ResponseEntity<>(uer, HttpStatus.BAD_REQUEST);
	}
}
