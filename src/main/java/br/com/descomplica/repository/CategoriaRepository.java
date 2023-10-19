package br.com.descomplica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.descomplica.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
}
