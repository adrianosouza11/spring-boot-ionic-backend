package com.adrianosouza.coursemc.repositories;

import com.adrianosouza.coursemc.domain.Categoria;
import com.adrianosouza.coursemc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
