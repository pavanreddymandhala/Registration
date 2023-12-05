package com.cg.registration.exception;

public class RegistrationException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public RegistrationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public void UserNotFoundException(String message) {
//		super(message);
		
	}
	public static class InvalidRoleException extends RuntimeException {
	    public InvalidRoleException(String message) {
	        super(message);
	    }
	}
}
