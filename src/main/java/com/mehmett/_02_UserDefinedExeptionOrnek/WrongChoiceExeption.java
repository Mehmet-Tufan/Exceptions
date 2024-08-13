package com.mehmett._02_UserDefinedExeptionOrnek;

public class WrongChoiceExeption extends Exception {
	public WrongChoiceExeption() {
		super();
	}
	
	public WrongChoiceExeption(String message) {
		super(message);
	}
}