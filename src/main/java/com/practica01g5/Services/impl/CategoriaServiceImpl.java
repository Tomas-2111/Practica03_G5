package com.Practica01G5.Services.impl;

import com.practica01g5.dao.CategoriaDao;
import com.practica01g5.domain.Categoria;
import com.practica01g5.Services.CategoriaServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Erick
 */
@Service
public class CategoriaServiceImpl implements CategoriaServices {

    @Autowired
    private CategoriaDao arbolDao;

    @Override
    @Transactional(readOnly=true)
    public List<Categoria> getArboles() {
        return arbolDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Categoria getArbol(Categoria arbol) {
        return arbolDao.findById(arbol.getIdArbol()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Categoria arbol) {
        arbolDao.save(arbol);
    }

    @Override
    @Transactional
    public void delete(Categoria arbol) {
        arbolDao.delete(arbol);
    }
}
