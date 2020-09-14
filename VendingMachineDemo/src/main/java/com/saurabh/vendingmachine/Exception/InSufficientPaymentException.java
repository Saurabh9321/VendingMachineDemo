package com.saurabh.vendingmachine.Exception;

public class InSufficientPaymentException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private long remaining;
	public InSufficientPaymentException(String message, long remaining) {
		
		this.message = message;
		this.remaining = remaining;
	}
	
	public long getRemaining(){
        return remaining;
    }
	
    public String getMessage(){
        return message;
    }

}
