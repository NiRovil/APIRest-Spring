package br.com.descomplica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.descomplica.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
