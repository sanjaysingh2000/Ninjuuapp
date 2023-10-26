package com.banking.Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerClass {
	
	@ExceptionHandler(ArithmeticException.class)
	public String ArithmeticException(ArithmeticException e) {
		System.out.println(e.getMessage());
		return "exception";
		}
	
}
