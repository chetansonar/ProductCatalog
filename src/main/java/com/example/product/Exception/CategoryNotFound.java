package com.example.product.Exception;

public class CategoryNotFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1145800094750012936L;

	public CategoryNotFound(String msg) {
		super(msg);
	}

}
