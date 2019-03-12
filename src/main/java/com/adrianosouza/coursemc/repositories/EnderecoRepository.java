package com.adrianosouza.coursemc.repositories;

import com.adrianosouza.coursemc.domain.Cliente;
import com.adrianosouza.coursemc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
