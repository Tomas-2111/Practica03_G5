package com.practica01g5.dao;

import com.practica01g5.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArbolDao extends JpaRepository <Arbol,Long> {
    
}
