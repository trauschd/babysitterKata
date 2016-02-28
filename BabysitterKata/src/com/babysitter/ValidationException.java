package com.babysitter;

public class ValidationException extends Exception{
	private static final long serialVersionUID = 4004932248015172253L;
	
	private static final String MSG = "Start time must be no earlier then 5 PM and End time must be no later to 4 PM";
	
	public ValidationException(){
		super(MSG);
	}
}
