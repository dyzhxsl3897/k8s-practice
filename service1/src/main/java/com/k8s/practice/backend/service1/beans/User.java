package com.k8s.practice.backend.service1.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class User {

	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private String password;

}
