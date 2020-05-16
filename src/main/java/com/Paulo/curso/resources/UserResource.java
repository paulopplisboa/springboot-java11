package com.Paulo.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Paulo.curso.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User (1L, "Maria Silva", "maria@gmail.com", "91265389", "123456");
		return ResponseEntity.ok().body(u);
	}

}