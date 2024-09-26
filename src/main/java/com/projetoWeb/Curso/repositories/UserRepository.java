package com.projetoWeb.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoWeb.Curso.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
