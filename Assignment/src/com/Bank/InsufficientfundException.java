package com.Bank;

@SuppressWarnings("serial")
public class InsufficientfundException extends Exception{
	
	
	public InsufficientfundException(String Message)
	{
		super(Message);
	}

}
