package com.mehmett._01_UserDefinedExeption;

public class NotOutOfBoundsExeption extends Exception{
	public NotOutOfBoundsExeption() {
		super();
	}
	
	public NotOutOfBoundsExeption(String message) {
		super(message);
	}
}