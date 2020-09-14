package com.saurabh.vendingmachine.Exception;

public class InSufficientChangeToReturnException extends RuntimeException{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public InSufficientChangeToReturnException(String message) {
		
		this.message = message;
	}
	
	
	
	public String getMessage(){
        return message;
    }
	 
	 
}
