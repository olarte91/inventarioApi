package com.katusoft.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.katusoft.inventario.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
