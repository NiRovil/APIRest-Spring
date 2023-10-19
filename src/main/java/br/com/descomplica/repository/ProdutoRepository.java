package br.com.descomplica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.descomplica.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
