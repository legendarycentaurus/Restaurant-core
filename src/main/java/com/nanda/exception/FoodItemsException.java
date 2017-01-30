package com.nanda.exception;

public class FoodItemsException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*
	public FoodItemsException(String message, Throwable cause) {
		super(message, cause);
		
	}
*/
	public FoodItemsException(String message) {
		super(message);
		
}
}