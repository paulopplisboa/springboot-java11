package com.Paulo.curso.services.Exception;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("resource not foud. Id" +id);
	}

}
