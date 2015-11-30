package org.example.exception;

public class NotFindException extends NullPointerException {	
	private static final long serialVersionUID = 1L;

	public NotFindException() {
		this("No encontrado");
	}
	
	public NotFindException(String message){
		super(message);
	}
}
