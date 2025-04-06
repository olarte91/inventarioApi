package com.katusoft.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.katusoft.inventario.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
