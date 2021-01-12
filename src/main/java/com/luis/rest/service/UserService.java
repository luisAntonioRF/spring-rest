package com.luis.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import com.github.javafaker.Faker;
import com.luis.rest.model.User;

@Service
public class UserService {

	@Autowired
	private Faker faker;
	
	private List<User> users = new ArrayList<>();
	
	public List<User> getUsers() {
		return users;
	}

	@PostConstruct
	public void init() {
		
		for (int i = 0; i < 100; i++) {
			users.add(new User(faker.funnyName().name(),faker.name().username() , faker.dragonBall().character()));
		}
	}
	
	public User getUser(String useName) {
		return users.stream().filter(u -> u.getUser().equals(useName)).findAny().orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("User %s not found", useName)));												
	}
}
