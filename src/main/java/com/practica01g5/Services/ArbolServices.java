package com.practica01g5.Services;
 
import com.practica01g5.domain.Arbol;
import java.util.List;
 
 
public interface ArbolServices {
   // Obtiene una lista de árboles,
   public List<Arbol> getArboles();
   public Arbol getArbol(Arbol arbol);
   public void save(Arbol arbol);
   public void delete(Arbol arbol);
}