package com.projetoWeb.Curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoWeb.Curso.entites.User;
import com.projetoWeb.Curso.services.UserServices;

@RestController
@RequestMapping(value = "/users")
public class UserResorces {
	
	@Autowired
	private UserServices service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){	
		List<User>list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
