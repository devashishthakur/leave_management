package com.sapient.lms.service;

public class InsufficientLeaveBalance extends Exception{
	
	public InsufficientLeaveBalance(String message)
	{
		super(message);
	}
}
