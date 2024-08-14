package com.mehmett._03_UserSearch;

public class UserNotFoundExeption extends Exception{
	public UserNotFoundExeption() {
		super();
	}
	
	public UserNotFoundExeption(String message) {
		super(message);
	}
}