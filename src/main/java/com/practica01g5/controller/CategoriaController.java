package com.practica01g5.controller;

import com.practica01g5.domain.Categoria;
import com.practica01g5.Services.CategoriaServices;
import com.practica01g5.Services.impl.FirebaseStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j //manejar solicitudes de HHTP
@RequestMapping("/arbol")//localhost:8080/categoria
public class CategoriaController {

    @Autowired
    private CategoriaServices arbolService;

//    @Autowired
//    private FirebaseStorage firebaseStorageService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var arboles = arbolService.getArboles();
        model.addAttribute("arboles", arboles);
        model.addAttribute("totalArboles", arboles.size());
        return "/arbol/listado";
    }

    @GetMapping("/nuevo")
    public String nuevo(Categoria arbol) {
        return "/arbol/modifica";
    }

    @PostMapping("/guardar")
    public String guardar(Categoria arbol,
                          @RequestParam("imagenFile") MultipartFile imagenFile) {
        if (!imagenFile.isEmpty()) {
            arbolService.save(arbol);

        }
        arbolService.save(arbol);
        return "redirect:/arbol/listado";
    }

    @GetMapping("/eliminar/{idArbol}")
    public String eliminar(Categoria arbol) {
        arbolService.delete(arbol);
        return "redirect:/arbol/listado";
    }

    @GetMapping("/modificar/{idArbol}")
    public String modificar(Categoria arbol, Model model) {
        arbol = arbolService.getArbol(arbol);
        model.addAttribute("arbol", arbol);
        return "/arbol/modifica";
    }
}