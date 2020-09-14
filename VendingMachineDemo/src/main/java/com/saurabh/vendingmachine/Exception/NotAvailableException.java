package com.saurabh.vendingmachine.Exception;

public class NotAvailableException extends Exception {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public NotAvailableException(String string) {
		this.message = string;
	}
	
	@Override
    public String getMessage(){
        return message;
    }

}
