package com.adrianosouza.coursemc.repositories;

import org.springframework.stereotype.Repository;

import com.adrianosouza.coursemc.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
