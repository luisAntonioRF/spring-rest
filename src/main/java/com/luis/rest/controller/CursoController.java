package com.luis.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.rest.model.User;
import com.luis.rest.service.UserService;

@RestController
@RequestMapping("/users")
public class CursoController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getUsers() {
		return new ResponseEntity<>(userService.getUsers(),HttpStatus.OK);
	}
	
	@GetMapping("/{user}")
	public ResponseEntity<User> getByUserName(@PathVariable String user){
		return new ResponseEntity<User>(userService.getUser(user), HttpStatus.OK);
	}
	
}
