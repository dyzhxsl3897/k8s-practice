package com.k8s.practice.backend.service1.repos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.k8s.practice.backend.service1.beans.User;

@Repository
public class UserRepository {

	private List<User> users;

	public UserRepository() {
		this.users = new ArrayList<User>();
		this.users.add(new User("George", "Smith", "george.smith", "george.smith@gmail.com", "1234567"));
	}

	public User getUserByUsername(String username) {
		return this.users.stream().filter(user -> user.getUsername().equals(username)).findFirst().orElse(null);
	}

}
