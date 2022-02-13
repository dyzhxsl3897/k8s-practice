package com.k8s.practice.backend.service1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.k8s.practice.backend.service1.beans.User;
import com.k8s.practice.backend.service1.repos.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User getUserByUsername(String username) {
		return userRepository.getUserByUsername(username);
	}

}
