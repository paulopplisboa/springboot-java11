package com.Paulo.curso.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Paulo.curso.services.Exception.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> reourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		
		String error = "resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}

}
