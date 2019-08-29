package com.adrianosouza.coursemc.services;

import java.util.Optional;

import com.adrianosouza.coursemc.services.exception.DataIntegrityException;
import com.adrianosouza.coursemc.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.adrianosouza.coursemc.domain.Categoria;
import com.adrianosouza.coursemc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria find(Integer id){
		Optional<Categoria> categoria = repository.findById(id);
		
		return categoria.orElseThrow(() -> {
			return new ObjectNotFoundException("Objeto não encontrado ID " + id + ", tipo: " + Categoria.class.getName());
		});
	}

	public Categoria insert(Categoria categoria){
		categoria.setId(null);
		return repository.save(categoria);
	}

	public Categoria update(Categoria categoria){
		find(categoria.getId());
		return repository.save(categoria);
	}

	public void delete(Integer id) {
		find(id);
		try{
			repository.deleteById(id);
		}catch (DataIntegrityViolationException e){
			throw new DataIntegrityException("Não é possível excluir uma categoria que possui produtos");
		}

	}
}
