package com.projetoWeb.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoWeb.Curso.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
