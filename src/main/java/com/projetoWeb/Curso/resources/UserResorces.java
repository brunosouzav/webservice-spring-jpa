package com.projetoWeb.Curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoWeb.Curso.entites.User;

@RestController
@RequestMapping(value = "/users")
public class UserResorces {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(null, "Bruno Souza", "bruno@gmail.com", "9999999", "1234");
		return ResponseEntity.ok().body(u);
		
	}
	

}
