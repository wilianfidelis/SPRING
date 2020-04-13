package com.example.veltiapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.veltiapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	
}
