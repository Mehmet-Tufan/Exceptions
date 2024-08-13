package com.mehmett._03_UserSearch;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
	List<User> users;
	
	public UserRepository() {
		this.users=new ArrayList<>();
		users.add(new User("Ayhan"));
		users.add(new User("Berk"));
		users.add(new User("Bahar"));
		users.add(new User("Su"));
		users.add(new User("Can"));
		users.add(new User("Emel"));
	}
}