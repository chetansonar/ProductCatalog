package com.example.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.product.Exception.CategoryNotFound;
import com.example.product.model.ResponseBody;

@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler(CategoryNotFound.class)
	public ResponseEntity<ResponseBody> getCategoryNotFoundException(CategoryNotFound ex){
		ResponseBody RB = new ResponseBody();
		RB.setError_msg(ex.getMessage());
		RB.setStatus(false);
		return new ResponseEntity<>(RB,HttpStatus.NOT_FOUND);
	}
	
	
}
