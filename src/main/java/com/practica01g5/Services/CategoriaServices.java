package com.practica01g5.Services;
import com.practica01g5.domain.Categoria;
import java.util.List;

public interface CategoriaServices {

    // Obtiene una lista de árboles,
    public List<Categoria> getArboles();

    public Categoria getArbol(Categoria arbol);

    public void save(Categoria arbol);

    public void delete(Categoria arbol);
}
