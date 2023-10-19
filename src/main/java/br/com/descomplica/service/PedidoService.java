package br.com.descomplica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.descomplica.entity.Pedido;
import br.com.descomplica.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	PedidoRepository pedidoRepository;
	
	public List<Pedido> getAll(){
		return pedidoRepository.findAll();
	}
	
	public Pedido getById(Integer id) {
		return pedidoRepository.findById(id).orElse(null);
	}
	
	public Pedido updatePedido(Integer id, Pedido pedido) {
		Pedido pedidoAtualizado = pedidoRepository.findById(id).orElse(null);
		if (pedidoAtualizado != null) {
			pedidoAtualizado.setPedidoData(pedido.getPedidoData());
			return pedidoRepository.save(pedidoAtualizado);
		}
		
		return null;
	}
	
	public Boolean deletePedido(Integer id) {
		Pedido pedido = this.getById(id);
		if(pedido != null) {
			pedidoRepository.delete(pedido);
			return true;
		}
		
		return false;
	}
	
}