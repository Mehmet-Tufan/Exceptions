package com.mehmett._03_UserSearch;

public class Runner {
	public static void main(String[] args) {
		UserRepository repository=new UserRepository();
		User su=null;
		try {
			System.out.println(repository.getUserByName("selim"));
		}
		catch (UserNotFoundExeption e) {
			e.printStackTrace();
		}
		System.out.println(su);
	}
}