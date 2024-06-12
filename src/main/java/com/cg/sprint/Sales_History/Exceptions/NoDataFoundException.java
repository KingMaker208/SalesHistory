package com.cg.sprint.Sales_History.Exceptions;

@SuppressWarnings("serial")
public class NoDataFoundException extends RuntimeException{
	public NoDataFoundException(String message) {
		super(message);
	}
}
