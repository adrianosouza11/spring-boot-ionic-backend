package com.adrianosouza.coursemc.services;


import com.adrianosouza.coursemc.domain.Pedido;
import com.adrianosouza.coursemc.repositories.PedidoRepository;
import com.adrianosouza.coursemc.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;
	
	public Pedido find(Integer id){
		Optional<Pedido> pedido = repository.findById(id);
		
		return pedido.orElseThrow(() -> {
			return new ObjectNotFoundException("Objeto não encontrado ID " + id + ", tipo: " + Pedido.class.getName());
		});
	}
}
