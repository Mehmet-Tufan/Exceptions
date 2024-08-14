package com.mehmett._03_UserSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	/**
	 * Bu metod dışarıdan gönderilen isimde bir kullanıcı bulursa o kullanıcıyı geri dönecek.
	 * Eğer bulamazsa null dönmeyelim. Kendi exceptionımızı fırlatalım.
	 * @param name
	 * @return
	 */
	
	public User getUserByName(String name) throws UserNotFoundExeption {
		Optional<User> optionalUser = users.stream().
				filter(user -> user.getName().equalsIgnoreCase(name))
		                                   .findFirst();
		return optionalUser.orElseThrow(()->new UserNotFoundExeption("aradığınız isimde bir user yok"));
		//return optionalUser.orElseThrow(UserNotFoundException::new);
	}
	
	
}