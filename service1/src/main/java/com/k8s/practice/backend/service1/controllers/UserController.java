package com.k8s.practice.backend.service1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.k8s.practice.backend.service1.beans.User;
import com.k8s.practice.backend.service1.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/getbyusername")
	public User getUserByUsername(@RequestParam(value = "username") String username) {
		return this.userService.getUserByUsername(username);
	}

}
