package com.cg.sprint.Sales_History.Exceptions;

@SuppressWarnings("serial")
public class InvalidDataException extends RuntimeException{
	public InvalidDataException(String msg) {
		super(msg);
	}
}