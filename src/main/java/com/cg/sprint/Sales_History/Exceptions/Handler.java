package com.cg.sprint.Sales_History.Exceptions;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@ComponentScan
public class Handler {

	@ExceptionHandler(value = NoDataFoundException.class)
	public ResponseEntity<CustomErrorResponse> handleNotFoundException(NoDataFoundException exe) {

		CustomErrorResponse st = new CustomErrorResponse();
		st.setStatus(HttpStatus.NOT_FOUND.value());
		st.setMessage(exe.getMessage());
		st.setTimestamp(System.currentTimeMillis());

		return new ResponseEntity<CustomErrorResponse>(st, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(value = InvalidDataException.class)
	public ResponseEntity<CustomErrorResponse> handleInvalidDataException(InvalidDataException exe) {

		CustomErrorResponse st = new CustomErrorResponse();
		st.setStatus(HttpStatus.BAD_REQUEST.value());
		st.setMessage(exe.getMessage());
		st.setTimestamp(System.currentTimeMillis());

		return new ResponseEntity<CustomErrorResponse>(st, HttpStatus.BAD_REQUEST);

	}
}