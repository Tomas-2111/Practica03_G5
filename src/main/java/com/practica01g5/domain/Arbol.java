package com.practica01g5.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")
public class Arbol implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arbol")
    private Long idArbol;
    private String nombreComun;
    private String tipoFlor;
    private Float durezaMadera;
    private String rutaImagen;

    public Arbol() {
    }

    public Arbol(String nombreComun, String tipoFlor, Float durezaMadera, String rutaImagen) {
        this.nombreComun = nombreComun;
        this.tipoFlor = tipoFlor;
        this.durezaMadera = durezaMadera;
        this.rutaImagen = rutaImagen;
    }
}