package com.brayanvargas.recursocomputadores.web;

import com.brayanvargas.recursocomputadores.domain.Computador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;

@RestController
public class RecursoControlador {

    @Autowired
    private ComputadorRespositorio computadorRespositorio;

    @RequestMapping("/saludar")
    public String saludar(){
        return "Hola mundo";
    }

    @GetMapping("/computador")
    public List<Computador> getAll(){
        return computadorRespositorio.getAll();
    }

    @GetMapping
    public List<Computador> getByMarca(@PathVariable String marca){
        return computadorRespositorio.getAllByMarca(marca);
    }

}
