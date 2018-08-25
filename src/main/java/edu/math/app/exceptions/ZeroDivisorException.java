package edu.math.app.exceptions;

public class ZeroDivisorException extends Exception {
	/**
	 *  Should be thrown in all cases of attempting to divide any number by zero divisor
	 */
	private static final long serialVersionUID = 5445707180285858424L;
	private final String message;
	private final Throwable cause;
	
	public ZeroDivisorException(String message, Throwable cause) {
		this.message = message;
		this.cause = cause;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public Throwable getCause() {
		return cause;
	}	
}
