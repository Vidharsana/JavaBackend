package com.test.exception;

public class FruitNotFoundException extends RuntimeException{

	private static final long serialVersion = 1L;
	public FruitNotFoundException(String msg) {
		super(msg);
	}
}
