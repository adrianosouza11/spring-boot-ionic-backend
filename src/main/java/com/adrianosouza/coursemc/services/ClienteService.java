package com.adrianosouza.coursemc.services;

import com.adrianosouza.coursemc.domain.Cliente;
import com.adrianosouza.coursemc.repositories.ClienteRepository;
import com.adrianosouza.coursemc.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public Cliente find(Integer id){
		Optional<Cliente> cliente = repository.findById(id);
		
		return cliente.orElseThrow(() -> {
			return new ObjectNotFoundException("Objeto não encontrado ID " + id + ", tipo: " + Cliente.class.getName());
		});
	}
}
