package com.in28minutes.rest.webservices.restfulwebservice.users;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 3;
	
	static {
		users.add(new User(1, new Date(0), "Adam", "Irving", "Texas", "88 Las Colinas", "Hello World", "pat@citi.com", "510-555-9905"));
		users.add(new User(2, new Date(0), "James", "Oakland", "California", "102 Las Colinas", "Hello Irving", "pat@citi.com", "510-555-9905"));
		users.add(new User(3, new Date(0), "Jenny", "Houston", "Texas", "99 Las Colinas", "Hello California", "pat@citi.com", "510-555-9905"));
		
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		if(user.getId() == null) {
			user.setId(++usersCount);
		}
		
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	
}
