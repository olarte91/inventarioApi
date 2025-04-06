package com.katusoft.inventario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.katusoft.inventario.model.Categoria;
import com.katusoft.inventario.repository.CategoriaRepository;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> obtenerTodasLasCategorias(){
        return categoriaRepository.findAll();    
    }

}
