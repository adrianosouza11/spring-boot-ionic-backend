package com.adrianosouza.coursemc.repositories;

import com.adrianosouza.coursemc.domain.Cidade;
import com.adrianosouza.coursemc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
