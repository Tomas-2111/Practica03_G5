package com.practica01g5.dao;

import com.practica01g5.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria,Long> {
    
}
