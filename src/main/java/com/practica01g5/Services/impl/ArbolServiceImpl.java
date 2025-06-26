package com.practica01g5.Services.impl;

import com.practica01g5.dao.ArbolDao;
import com.practica01g5.domain.Arbol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.practica01g5.Services.ArbolServices;

/**
 *
 * @author Erick
 */
@Service
public class ArbolServiceImpl implements ArbolServices {

    @Autowired
    private ArbolDao arbolDao;

    @Override
    @Transactional(readOnly=true)
    public List<Arbol> getArboles() {
        return arbolDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Arbol getArbol(Arbol arbol) {
        return arbolDao.findById(arbol.getIdArbol()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Arbol arbol) {
        arbolDao.save(arbol);
    }

    @Override
    @Transactional
    public void delete(Arbol arbol) {
        arbolDao.delete(arbol);
    }
}
